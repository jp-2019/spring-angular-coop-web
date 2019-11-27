import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  //BASE_PATH: 'http://localhost:8080'
  USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser'

  public loginId: String;
  public password: String;

  constructor(private http: HttpClient) { }

  authenticationService(loginId: String, password: String) {
    return this.http.get(`/api/v1/basicauth`,
    { headers: { authorization: this.createBasicAuthToken(loginId, password) } }).pipe(map((res) => {
      this.loginId = loginId;
      this.password = password;
      this.registerSuccessfulLogin(loginId, password);
      console.log(loginId + " " + password);
    }));
  }

  createBasicAuthToken(loginId: String, password: String) {
    return 'Basic ' + window.btoa(loginId + ":" + password)
  }

  registerSuccessfulLogin(loginId, password) {
    sessionStorage.setItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME, loginId)
    console.log(loginId);
  }

  logout() {
    sessionStorage.removeItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME);
    this.loginId = null;
    this.password = null;
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null) return false
    return true
  }

  getLoggedInUserName() {
    let user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME)
    if (user === null) return ''
    return user
  }
}
