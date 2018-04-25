import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wagon {

    private ArrayList<Traveler> FirstClass;
    private ArrayList<Traveler> SecondClass;
    private int FirstClassSeats;
    private int SecondClassSeats;



    public Wagon(){

        FirstClass = new ArrayList<>();
        SecondClass = new ArrayList<>();

        FirstClassSeats = 3;
        SecondClassSeats = 4;
    }


    boolean firstClassFull(){
        return FirstClass.size() == FirstClassSeats;
    }


    boolean secondClassFull(){
        return SecondClass.size() == SecondClassSeats;
    }



    public void enterFirstClass(Traveler traveler){
        FirstClass.add(traveler);
    }

    public void enterSecondClass(Traveler traveler){
        if (!secondClassFull()){
            SecondClass.add(traveler);
        }
        else{
            System.out.println("Train is full");
        }
    }


    public void leaveWithDestination(String location) {
        ArrayList<Traveler> leavingPass = new ArrayList<>();


        for (Traveler t : FirstClass){
            if (t.getDestination().getLocation().equals(location)){
                leavingPass.add(t);
                System.out.println(t.getName() + " exists the train");
                }
            }

            FirstClass.removeAll(leavingPass);

        }

        public void ticketCheck(){

            ArrayList<Traveler> zwartRijders = new ArrayList<>();

            for(Traveler t : FirstClass){
                if(t.getTicket() == null){
                    zwartRijders.add(t);
                    System.out.println("We've ditched " + t.getName() + " out of the train");
                }

            }

            FirstClass.removeAll(zwartRijders);
            zwartRijders.clear();

            for(Traveler t : SecondClass){
                if(t.getTicket() == null){
                    zwartRijders.add(t);
                    System.out.println("We've ditched " + t.getName() + " out of the train");
                }

            }

            SecondClass.removeAll(zwartRijders);

        }

    }

