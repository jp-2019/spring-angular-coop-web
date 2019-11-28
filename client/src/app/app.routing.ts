import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';

export const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: LoginComponent }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes)
