package hw0;

public class SpaceAlien2 extends SpaceAlien implements ZapsWithSlime {

    private String msg;


    public SpaceAlien2(String homePlanet, double distanceFromEarth) {
        super(homePlanet, distanceFromEarth);

    }
    public void doGreeting(String msg){
        this.msg = msg;
        System.out.println(msg);

    }
    public String doSlimeZap (int numHumans){

        if (numHumans >= 1){
            System.out.println("You slimed " + numHumans + " Humans.");

            return "blech";


        }else{
            return "No humans slimed";
        }
        


    }
    public String slimeWholeEarth (){
        System.out.println("YOU SLIMED THE ENTIRE EARTH!!");

        return "BLECHHHHHH";

    }

    public static void main(String[] args) {
        SpaceAlien2 bob = new SpaceAlien2("Jupiter", 42);
        bob.doGreeting("Hi I am bob");
    }




}