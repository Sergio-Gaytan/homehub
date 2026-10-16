public class Main {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, "Fix kitchen facet", "High");
        Ticket ticket2 = new Ticket(2, "Replace backyard light", "Medium");

        //Ticket 1
        ticket1.description = "Fix kitchen faucet";
        ticket1.status = "Open";
        ticket1.assignedTo = "Sergio";

        ticket1.closeTicket();
        ticket1.displayTicket();

        System.out.println();

        ticket1.reopenTicket();
        ticket1.displayTicket();

        System.out.println();

        //Ticket 2
        ticket2.description = "Backyard light stopped working";
        ticket2.status = "Open";
        ticket2.assignedTo = "Sergio";
        ticket2.displayTicket();

    }
}
