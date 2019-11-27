import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { HelloWorldComponent } from './hello-world/hello-world.component';

export const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: LoginComponent },
  { path: 'hello-world', component: HelloWorldComponent },
  { path: 'logout', component: LoginComponent }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes)
