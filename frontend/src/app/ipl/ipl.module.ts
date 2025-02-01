
import { IplRoutingModule } from "./ipl-routing.module";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { TicketBookingComponent } from "./components/ticketbooking/ticketbooking.component";
import { VoteComponent } from "./components/vote/vote.component";
import { CricketerArrayComponent } from "./components/cricketerarray/cricketerarray.component";
import { CricketerCreateComponent } from "./components/cricketercreate/cricketercreate.component";
import { MatchCreateComponent } from "./components/matchcreate/matchcreate.component";
import { TeamCreateComponent } from "./components/teamcreate/teamcreate.component";
import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

@NgModule({
  declarations: [
    TicketBookingComponent,
    VoteComponent,
    CricketerArrayComponent,
    CricketerCreateComponent,
    MatchCreateComponent,
    TeamCreateComponent
  ],

  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
FormsModule
  ],
  exports: [
    TeamCreateComponent,
    MatchCreateComponent,
    CricketerArrayComponent,
    CricketerCreateComponent
   
  ]
})
export class IplModule {}




