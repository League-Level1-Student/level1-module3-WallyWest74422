package _01_intro_to_static;

public class Athlete {
	
    static int nextBibNumber=0;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";
    String name;
    int speed;
    int bibNumber;
    
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        nextBibNumber++;
        bibNumber=nextBibNumber;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete Bob = new Athlete( "Bob", 27);
    	Athlete Jeff = new Athlete( "Jeff", 22);
    	System.out.println(Bob.name);
    	System.out.println(raceLocation);
    	System.out.println(Bob.bibNumber);
    	System.out.println(Jeff.name);
    	System.out.println(raceLocation);
    	System.out.println(Jeff.bibNumber);
    }
}
