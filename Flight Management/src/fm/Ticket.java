package fm;

import java.util.Random;

public class Ticket {
   private String departure ;
   private String destination;
  private  String date;
   Random random=new Random();
 private  int pnr=random.nextInt();
 private  int price=3000;
  private int seatcounter=0;
private    int seat;
 private  String type;


    flight Flight ;
  Contact contact;

    public void bookflight(String departure, String destination , String date, int seat,flight Flight,String type )
    {
        this.departure=departure;
        this.destination=destination;
        this.date=date;
        this.Flight=Flight;
        this.seat=seat;
        seatcounter++;
        this.type=type;



    }


    public void ticketdetailes()
    {

        System.out.println(" Destination :"+destination+" Departure :"+departure+" Date :"+date+" price :"+price+" pnr  :"+pnr);
    }
    public String Status()
    {
        if ( seatcounter< 60) {
            return "ticket not confirmed";
        } else {
               return "ticket confirmed";

        }


    }



}
