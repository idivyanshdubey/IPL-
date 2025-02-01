import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent {
  registrationForm: FormGroup;
  successMessage: string = '';
  errorMessage: string = '';

  constructor(private fb: FormBuilder) {
    this.registrationForm = this.fb.group({
      fullName: ['', [Validators.required, Validators.minLength(3)]],
      username: ['', [Validators.required, Validators.pattern(/^[a-zA-Z0-9]+$/)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(8), Validators.pattern(/^(?=.*[A-Z])(?=.*\d).+$/)]]
    });
  }

  onSubmit() {
    if (this.registrationForm.valid) {
      this.successMessage = 'Registration successful!';
      this.errorMessage = '';
      console.log('User Data:', this.registrationForm.value);
      this.resetForm();
    } else {
      this.successMessage = '';
      this.errorMessage = 'Please fill out all required fields correctly.';
    }
  }

  resetForm() {
    this.registrationForm.reset();
  }
}
