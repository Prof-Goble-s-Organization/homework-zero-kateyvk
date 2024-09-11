package hw0;

public class SpaceAlien2 extends SpaceAlien implements ZapsWithSlime {

    private String name;

    public SpaceAlien2(String homePlanet, double distanceFromEarth,String name) {
        super(homePlanet, distanceFromEarth);
        this.name = name;

    }
    public void doGreeting(String msg){
        System.out.println(name +" says "+msg);

    }

    @Override 
    public String doSlimeZap (int numHumans){

        if (numHumans > 0){
            if (numHumans==1){
                System.out.println(name + " slimed " + numHumans + " human!");
                return "blech";

            }else{
                System.out.println(name + " slimed " + numHumans + " humans!");
                return "blech";
            }
            

        }else if(numHumans==0){
            return "No humans slimed";
        }else{
            return "error, can't slime negative people";
        }
    }

    @Override
    public String slimeWholeEarth (){
        return "BLECHHHHHH";

    }
    //getter method
    public String getAlienname(){
        return name;
    }

    public static void main(String[] args) {
        SpaceAlien2 bob = new SpaceAlien2("Jupiter", 42, "bob");
        bob.doGreeting("Hello World");
        System.out.println(bob.slimeWholeEarth());
        System.out.println(bob.doSlimeZap(1));
        System.out.println(bob.doSlimeZap(2));
        System.out.println(bob.doSlimeZap(-1));

    }




}