import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Cricketer } from "../../types/Cricketer";
<<<<<<< HEAD
import { Team } from "../../types/Team";
import { IplService } from "../../services/ipl.service";
import { HttpErrorResponse } from "@angular/common/http";


@Component({
  selector: 'app-cricketercreate',
  templateUrl: './cricketercreate.component.html',
  styleUrls: ['./cricketercreate.component.scss'] 
})
export class CricketerCreateComponent implements OnInit {


  cricketerForm: FormGroup;
  cricketer:Cricketer | null = null;
  successMessage: string | null = null;
  errorMessage: string | null = null;

  teams: Team[] = []

  constructor(private fb: FormBuilder, private iplService: IplService) {}

  ngOnInit(): void {
    this.loadTeams();
    this.cricketerForm = this.fb.group({
      team:[null, Validators.required],


  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.cricketerForm = this.fb.group({
      cricketerId: [null, [Validators.required]],
      teamId:[null, [Validators.required,]],
      cricketerName: ['', [Validators.required]],
      age: [null, [Validators.required,Validators.min(18)]],

      nationality: ['', [Validators.required]],
      experience: [null, [Validators.required,Validators.min(0)]],
      role:['',[Validators.required]],
      totalRuns:[null,[Validators.min(0)]],
      totalWickets:[null,[Validators.min(0)]]
    });
  }

  loadTeams(): void{
    this.iplService.getAllTeams().subscribe((teams) => {
      this.teams = teams;

      nationality: ['', [Validators.required, Validators.minLength(2)]],
      experience: [null, [Validators.required,Validators.min(1)]],
      role:['',[Validators.required]],
      totalRuns:[null,[Validators.required]],
      totalWickets:[null,[Validators.required]]
       
    });
  }

  onSubmit(): void {
    if (this.cricketerForm.valid) {

      this.iplService.addCricketer(this.cricketerForm.value).subscribe({
        next: (response) => {
          this.cricketer = response;
          this.errorMessage = null;
          console.log(this.cricketer);
          this.cricketerForm.reset();
        },
        error: (error) => {
          this.handleError(error);
        },
        complete: () => {
          this.successMessage = 'Cricketer created successfully!';
        }
      });

        this.cricketer = this.cricketerForm.value
      this.successMessage = 'Cricketer created successfully!';
      this.errorMessage = null;
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;

    }
  }

  resetForm(): void {
    this.cricketerForm.reset({
      cricketerId: null,
      teamId:null,
      cricketerName: '',
      age: '',
      nationality:'',
      experience:'',
      role:'',
      totalRuns:'',
      totalWickets:''
    });
  }

  private handleError(error: HttpErrorResponse): void{
    if(error.error instanceof ErrorEvent){
      this.errorMessage = `Client-side error: ${error.error.message}`;
    }else{
      this.errorMessage=`Server-side error: ${error.status} ${error.message}`;
      if(error.status === 400){
        this.errorMessage= 'Bad request. Please check your input.';
      }
    }
    this.successMessage = null;
    console.error('An error occured;', this.errorMessage);
  }

}
