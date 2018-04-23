public class Train {

   public Traveler [] places2 = new Traveler[4];
   public Traveler [] places1 = new Traveler[3];
   public Station locationTrain = new GoesStation();


   public void travelNext(){
       System.out.println("You travel to the next station...");

       if (locationTrain == new GoesStation()){
           locationTrain = new ArnemuidenStation();
           System.out.println("You've arrived in Arnemuiden");
       }
       else if(locationTrain == new ArnemuidenStation()){
           locationTrain = new MiddelburgStation();
           System.out.println("You've arrived in Middelburg");
       }
       else if(locationTrain == new MiddelburgStation()){
           locationTrain = new VlissingenStation();
           System.out.println("You've arrived in Vlissingen");
       }
       else if(locationTrain == new VlissingenStation()){
           locationTrain = new GoesStation();
           System.out.println("The train drives back to Goes");
       }

   }

    public int freePlaces() {
        for(int i = 0; i < places2.length; i++) {
            if (places2[i] == null)
                return i;
        }
        return -1;
    }

    public void getIn(Traveler traveler) {
        if (freePlaces() == -1) {
            System.out.println("the second class if full " + traveler.getName() +  " will enter the first class");
            return;
        }

        this.places2[freePlaces()] = traveler;
        showInfo(traveler);


    }
    public void showInfo(Traveler traveler){

       System.out.println(traveler.getName() + " entered the train");
    }







}
