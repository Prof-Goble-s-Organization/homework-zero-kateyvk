package hw0;

public class SpaceAlien2 extends SpaceAlien implements ZapsWithSlime {

    public SpaceAlien2(String homePlanet, double distanceFromEarth) {
        super(homePlanet, distanceFromEarth);

    }
    public void doGreeting(String msg){
        System.out.println(msg);

    }
    @Override 
    public String doSlimeZap (int numHumans){

        if (numHumans >= 1){
            System.out.println("You slimed " + numHumans + " Humans!");

            return "blech";


        }else if(numHumans<=0){
            return "No humans slimed";
        }else{
            return "error";
        }
        


    }
    @Override
    public String slimeWholeEarth (){
        return "BLECHHHHHH";

    }

    public static void main(String[] args) {
        SpaceAlien2 bob = new SpaceAlien2("Jupiter", 42);
        bob.doGreeting("Hi I am bob");
        bob.slimeWholeEarth();

    }




}