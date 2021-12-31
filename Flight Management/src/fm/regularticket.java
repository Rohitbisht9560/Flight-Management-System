package fm;

public class regularticket extends Ticket {
    private String food;
    private String drink;
    private String  snacks;
    flight Flight;

    public void setorder(String food,String drink,String  snacks) {
        this.food=food;
        this.drink=drink;
        this.snacks=snacks;

    }
    public void viewservices()
    {
        System.out.println(" Food :"+ food +'\n'+ " Drink :"+ drink +'\n'+" Snack :"+ snacks);

    }
}
