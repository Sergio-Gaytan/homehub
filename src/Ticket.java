public class Ticket {
    String title;
    String description;
    String priority;
    String status;
    int id;
    String assignedTo;

    public Ticket (int ticketId, String ticketTitle, String ticketPriority){
        id = ticketId;
        title = ticketTitle;
        priority = ticketPriority;

    }

    public void displayTicket() {
        System.out.println("Ticket ID: " + id);
        System.out.println("Ticket Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
        System.out.println("Assigned To: " + assignedTo);
    }

    public void closeTicket() {
        status = "Closed";
    }

    public void reopenTicket() {
        status = "Open";
    }
}
