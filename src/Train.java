import java.util.ArrayList;

public class Train {

   ArrayList<Wagon> wagons;
   ArrayList<Station> stations;
   Station currentStation;


   public Train(Wagon wagon){



       stations = new ArrayList<>();
       this.wagons = new ArrayList<>();

       stations.add(new Station("Goes"));
       stations.add(new Station("Arnemuiden"));
       stations.add(new Station("Middelburg"));
       stations.add(new Station("Souburg"));
       stations.add(new Station("Vlissingen"));
       currentStation = stations.get(0);


       this.wagons.add(wagon);
   }

    public void enterFirst(Traveler traveler){
       //check eerste klas
        for(Wagon w : wagons){
            //checkt ruimte eerste klas
            if(!w.firstClassFull()){
                w.enterFirstClass(traveler);
                System.out.println(traveler.getName() + " gets into first class");
                return;
            }
        }
        // checkt tweede klas
        for(Wagon w : wagons){
            //checkt ruimte tweede klas
            if(!w.secondClassFull()){
                w.enterSecondClass(traveler);
                System.out.println(traveler.getName() + " gets into second class");
                return;
            }
        }

   }

   public void enterSecond(Traveler traveler){
       //check eerste klas
       for(Wagon w : wagons){
           //checkt ruimte eerste klas
           if(!w.secondClassFull()){
               w.enterSecondClass(traveler);
               System.out.println(traveler.getName() + " gets into second class");
               return;
           }
       }
       // checkt tweede klas
       for(Wagon w : wagons){
           //checkt ruimte tweede klas
           if(!w.firstClassFull()){
               w.enterFirstClass(traveler);
               System.out.println(traveler.getName() + " gets into first class");
               return;
           }
       }

   }

    public void leaveStation(){
       System.out.println("We're leaving " + currentStation.getLocation());
    }

    public void arriveStation(){
       currentStation = stations.get(stations.indexOf(currentStation)+1);

       System.out.println("were arriving in " + currentStation.getLocation());
       leaveTrain();
    }


    public void leaveTrain(){
       for(Wagon w : wagons){
           w.leaveWithDestination(currentStation.getLocation());

           System.out.println();

       }

    }

    public void addWagon(Wagon wagon){
       System.out.println("Wagon is being added");
       wagons.add(wagon);
    }



}
