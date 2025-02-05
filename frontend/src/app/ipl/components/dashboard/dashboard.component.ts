
import { Component, OnInit } from "@angular/core";
import { Team } from "../../types/Team";
import { Cricketer } from "../../types/Cricketer";
import { Match } from "../../types/Match";
import { IplService } from "../../services/ipl.service";

@Component({
    selector:'app-dashboard',
    templateUrl:'./dashboard.component.html',
    styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  teams: Team[] = [];
    cricketers: Cricketer[] = [];
    matches: Match[] = [];

    constructor(private iplService: IplService){}

    ngOnInit(): void{
        this.loadTeams();
        this.loadCricketers();
        this.loadMatches();
    }

    loadTeams(): void{
        this.iplService.getAllTeams().subscribe((teams) => {
            this.teams = teams;
        });
    }

    loadCricketers(): void{
        this.iplService.getAllCricketers().subscribe((cricketers) => {
            this.cricketers = cricketers;
        });
    }

    loadMatches(): void{
        this.iplService.getAllMatches().subscribe((matches) => {
            this.matches = matches;
        });
    }

}
