import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
  }

  mainForm = this.fb.group({
  loginId: '',
  password: ''
  })

  onSubmit(){

  }

 }
