import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AppService } from '../app.service';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthService } from './auth.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  errorMessage = 'Invalid Credentials';
  successMessage: string;
  invalidLogin = false;
  loginSuccess = false;


  constructor(private route: ActivatedRoute, private router: Router, private authService: AuthService, private fb: FormBuilder) { }

  ngOnInit() {
  }

  credentials = this.fb.group({
  loginId: '',
  password: ''
  })

  login() {
    this.authService.authenticationService(this.credentials.value.loginId, this.credentials.value.password).subscribe((result) => {
      this.invalidLogin = false;
      this.loginSuccess = true;
      this.successMessage = 'Login Successful.';
      this.router.navigate(['/hello-world']);
    }, () => {
      this.invalidLogin = true;
      this.loginSuccess = false;
    });
  }
}
