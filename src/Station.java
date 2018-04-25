public class Station {
    private String location;
    private boolean ticketcheck;

    public Station(String location){
        this.location = location;

    }

    public String getLocation(){
        return location;
    }


    public boolean isTicketcheck() {
        return ticketcheck;
    }

    public void setTicketcheck(boolean ticketcheck) {
        this.ticketcheck = ticketcheck;
    }
}
