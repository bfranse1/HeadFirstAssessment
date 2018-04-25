public class Main {


    public static void main(String[] args) {

        Train train = new Train(new Wagon());

        Station goesStation = new Station("Goes");
        Station middelburgStation = new Station("Middelburg");
        Station vlissingenStation = new Station("Vlissingen");
        Station arnemuidenStation = new Station("Arnemuiden");
        Station souStation =  new Station("Souburg");

        Ticket vlisFirstClass = new FirstClassTicket();
        Ticket middFirstClass = new FirstClassTicket();
        Ticket arneFirstClass = new FirstClassTicket();
        Ticket goesFirstClass = new FirstClassTicket();

        Ticket goesSecondClass = new SecondClassTicket();
        Ticket vlisSecondClass = new SecondClassTicket();
        Ticket middSecondClass = new SecondClassTicket();
        Ticket arneSecondClass = new SecondClassTicket();

        //instant alle travelers
        Traveler bart = new Traveler("Bart", vlisFirstClass, vlissingenStation);
        Traveler geffrey = new Traveler("Geffrey", vlisSecondClass, vlissingenStation);
        Traveler erik = new Traveler("Erik", vlisSecondClass, vlissingenStation);
        Traveler andries = new Traveler("Andires", vlisSecondClass, vlissingenStation);
        Traveler lorena = new Traveler("Lorena", vlisSecondClass, vlissingenStation);
        Traveler jordy = new Traveler("Jordy", vlisSecondClass, vlissingenStation);
        Traveler henk = new Traveler("Henk", arneSecondClass, souStation);
        Traveler piet = new Traveler("Piet", arneSecondClass, souStation);
        Traveler robert = new Traveler("Robert", middFirstClass, vlissingenStation);

        //zwartrijder
        Traveler ramona = new Traveler("Romona", null, middelburgStation);


        //instappen in goes
        train.enterFirst(bart);
        train.enterSecond(geffrey);
        train.enterSecond(erik);
        train.enterSecond(andries);
        train.enterSecond(lorena);
        train.enterSecond(jordy);
        train.enterFirst(ramona);

        //weg uit goes
        train.leaveStation();
        train.arriveStation();

        //aankomen in arnemuiden

        train.addWagon(new Wagon());
        train.enterSecond(henk);
        train.enterSecond(piet);




        //weg uit arnemuiden
        train.leaveStation();
        train.arriveStation();
        //aankomen in middelburg

        train.enterFirst(robert);

        //weg uit middelburg
        train.leaveStation();
        train.arriveStation();
        //aankomen in soeburg

        //weg uit soeburg
        train.leaveStation();
        train.arriveStation();
        //aankomen in vlissingen






    }

}
