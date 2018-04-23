public class Main {


    public static void main(String[] args) {

        Train train = new Train();

        GoesStation goesStation = new GoesStation();
        ArnemuidenStation arnemuidenStation = new ArnemuidenStation();
        MiddelburgStation middelburgStation = new MiddelburgStation();
        VlissingenStation vlissingenStation = new VlissingenStation();

        train.travelNext();
        train.travelNext();

        Traveler bart = new Traveler("Bart");
        Traveler jan = new Traveler("Jan");
        Traveler piet = new Traveler("Piet");
        Traveler bob = new Traveler("Bob");
        Traveler klaas = new Traveler("Klaas");
        Traveler joep = new Traveler("Joep");


        train.getIn(bart);
        train.getIn(jan);
        train.getIn(piet);
        train.getIn(bob);
        train.getIn(klaas);
        train.getIn(joep);



    }

}
