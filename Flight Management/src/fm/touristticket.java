package fm;


public class touristticket  extends Ticket{
    flight Flight;
    private String [] location=new String[5];
     private int lcounter=0;
   private String  hoteladdress;

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }
    public String getHoteladdress()
    {
        return hoteladdress;
    }


    public  void addlocation(String l, int location_no)
    {
        if(lcounter<5) {
            for (int i=location_no-1 ; i<location_no;i++) {
                location[i] =l;
            }
            lcounter++;
        }
        else
        {
            System.out.println("loaction full");
        }
    }
    public void deletelocation(String l)
    {
        for(int i = 0; i <location.length;i++ )
        {
            if (location[i].equals(l))
            {
                location[i]=null;
                break;

            }
            else {
                System.out.println("location not found");
            }
        }
    }
    public void printlocation()
    {
        for(int i=0;i<location.length;i++)
        {
            System.out.println("------------Tourist Location-----------");
            System.out.println(location[i]);


        }
    }

}