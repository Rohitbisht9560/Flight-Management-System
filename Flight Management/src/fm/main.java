package fm;

public class main {
    public static void main(String args[]){
        Passenger p=null;
        flight Flight=new flight(22);
        touristticket tl=new touristticket();
        Address address=new Address("rk road","delhi","delhi");
        p = new Passenger("Rohit", 989151440, "rbc@gmail.com", address);
        Ticket t=new Ticket();
        Ticket t2=new Ticket();
        Contact contact=new Contact("Rohit","9560225635","rbc@gmail.com");
        regularticket r=new regularticket();

       t.bookflight("Delhi","Mumbai","27/03/2022",5,Flight,"Regular");
       r.setorder("Pasta","Water","Biscuits");
       t.Status();
       t.ticketdetailes();
       r.viewservices();
       t2.bookflight("Mumbai","Delhi","29/04/2022",6,Flight,"tourist");
       tl.setHoteladdress("Raj Hotel, Karol Bagh, Delhi");
       t2.ticketdetailes();
       tl.addlocation("Red Fort",1);
       tl.addlocation("lotus temple",2);
       tl.printlocation();





    }
}
