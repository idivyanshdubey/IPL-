
export class TicketBooking {
  bookingId: number;
  email: string;
  matchId: number;
  numberOfTickets: number;

  constructor(
    bookingId: number,
    email: string,
    matchId: number,
    numberOfTickets: number,

    numberOfTicketes: number,

  ){
    this.bookingId=bookingId;
    this.email=email;
    this.matchId=matchId;

    this.numberOfTickets=numberOfTickets;

    this.numberOfTickets=numberOfTickets;

    this.numberOfTickets=numberOfTicketes;

  }
  displayInfo(){
    console.log(`Booking ID: ${this.bookingId}`);
    console.log(`Email: ${this.email}`);

    console.log(`Number of tickets: ${this.numberOfTickets}`);

    console.log(`Number of tickets: ${this.numberOfTickets}`);

    console.log(`Number of tickets: ${this.numberOfTickets}`);


  }
}
