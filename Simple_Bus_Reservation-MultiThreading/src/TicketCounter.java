import java.util.*;
public class TicketCounter {
    Scanner scan=new Scanner(System.in);
    private int availableSeats = 3;

    public synchronized void bookTicket(String name,int noOfSeats){
        if(availableSeats >= noOfSeats && availableSeats > 0){
            System.out.println("Hi "+name+" : "+noOfSeats+" seats booked successfully...");
            availableSeats=availableSeats-noOfSeats;
        }
        else if(availableSeats < noOfSeats){
            System.out.println(name+" , we have only "+availableSeats+" seats available. Would you like to book this? (yes/no)");
            String value=scan.nextLine();
            if(value.equals("yes")){
                System.out.println("You booked "+availableSeats+" seats");
                System.out.println("Your ticket Booked , Happy Journey...!");
                availableSeats=noOfSeats-availableSeats;
            }
            else{
                System.out.println("Try earlier the next time... Thank you");
            }
        }
        else{
            System.out.println("Hi "+name+" : "+" Seats not available");
        }
    }
}
