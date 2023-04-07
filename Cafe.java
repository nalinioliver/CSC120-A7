/* This is a stub for the Cafe class */
/**
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours on Monday, and ArrayList and Hashtable documentation that Prof Crouser linked on the github assignment. Also used W3 schools to understand how to use super() on methods: https://www.w3schools.com/java/ref_keyword_super.asp
 */


 /**
  * Extends the Cafe class from the Building class, establishes necessary parameters to make the Cafe class function. 
  */
 public class Cafe extends Building {
    /**
     * Shows the available functions in the Cafe class by printing out a statement listing these functions.
     */
    public void showOptions() {
        super.showOptions();
        System.out.println("Available options at " + this.name + ":\n + sellCoffee()");
    }

    /**
     * Overrides the gotoFloor() method to throw an exception, since there's not an elevator and cannot travel past the first floor. 
     * @param floorNum: The present floor number that the user is on.
     */
    public void goToFloor(int floorNum) {
      super.goToFloor(floorNum);
        throw new RuntimeException("You do not have an elevator to travel between floors");
  }
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Extends the Cafe class to the Building Class, and creates variables necessary to run the Cafe class
     * @param nCoffeeOunces: Number of coffee ounces left in the cafe
     * @param nSguarPackets: Number of sugar packets left in the cafe
     * @param nCreams: Number of cream containers left in the cafe
     * @param nCups: Number of cups left in the cafe 
     * @param name: Name of the cafe
     * @param address: Address of the cafe
     * @param nFloors: Number of floors of the cafe 
     */
    public Cafe(int nCoffeeOunces, int nSguarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Removes items from inventory everytime a coffee is sold
     * @param size: The number of ounces in the coffee that was sold
     * @param nSugarPackets: The number of sugar packets used in the coffee that was sold
     * @param nCreams: The number of cream containers that were used in the coffee that was sold
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
    }

    /**
     * Creates a new Cafe named cafe neilson, with the given parameters listed above 
     */
    public static void main(String[] args) {
        Cafe Compass = new Cafe(7, 7, 9, 4, "Neilson", "7 Neilson Drive", 4);
    }
    
}
