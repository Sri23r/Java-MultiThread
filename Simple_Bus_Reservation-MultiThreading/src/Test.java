public class Test {
    public static void main(String[] args) throws Exception{
        TicketCounter ticketcounter=new TicketCounter();
        TicketBookingThread t1=new TicketBookingThread(ticketcounter,"Srinath",2);
        TicketBookingThread t2=new TicketBookingThread(ticketcounter,"Rahul",2);

        t1.start();
        t1.join();
        t2.start();
        
        t2.join();
    }
}
