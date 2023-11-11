public class Ticket {
    private String destination;
    private String date;
    private int numberOfTickets;
    public Ticket(String  destination, String date, int numberOfTickets){
        this.destination = destination;
        this.date = date;
        this.numberOfTickets = numberOfTickets;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
