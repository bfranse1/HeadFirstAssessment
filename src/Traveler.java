public class Traveler {

    private String name;
    private Ticket ticket;
    private Station destination;


    public Traveler(String name, Ticket ticket, Station destination){

        this.name = name;
        this.ticket = ticket;
        this.destination = destination;
    }


    public String getName(){

        return this.name = name;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }
}
