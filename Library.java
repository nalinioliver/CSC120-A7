/* This is a stub for the Library class */
import java.util.Hashtable;

/**
 * @author: Nalini Oliver
  * Resources: CSC 120 TA hours on Monday, and ArrayList and Hashtable documentation that Prof Crouser linked on the github assignment. Also used W3 schools to understand how to use super() on methods: https://www.w3schools.com/java/ref_keyword_super.asp
 */


/**
 * Extends the library class from the building class, establishes the necessary parameteres to make the house class function. 
 */
public class Library extends Building {
    /**
     * Shows the avalible functions in the library class by printing out a statement listing these functions
     */
    public void showOptions() {
      super.showOptions();
      System.out.println("Available options at " + this.name + ":\n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook() \n + containsTitle() \n isAvaliable() \n printCollection()");
  }
    /**
     * Overrides the gotoFloor() method when there's an elevator so they can move more than one floor at a time, but first checks to see if there's an elevator in the house.
     */
    public void goToFloor(int floorNum) {
      super.goToFloor(floorNum);
      if (this.hasElevator = false) {
        throw new RuntimeException("You do not have an elevator to travel between floors");
      }
      this.activeFloor = floorNum + 2;
  }
  private Hashtable<String, Boolean> collection;
  private boolean hasElevator;
    /**
     * Extends the Library class to the Building Class, and creates variables necessary to run the Library class
     * @param name: Name of the library
     * @param address: Address of the library
     * @param nFloors: Number of floors of the library 
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.hasElevator = hasElevator;
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * States that the new title is now in the library (true) when its added 
     * @param title: Title of the library book that was added
     */
    public void addTitle(String title) { 
      this.collection.put(title, true);
    }

    /**
     * States that the title is not in the library (false) when its removed 
     * @param title: Title of the library book that was removed
     * @return: Title of the library book that was removed 
     */
    public String removeTitle(String title) {
      this.collection.remove(title, false);
      return title;
    }

    /**
     * States that the existing title is no longer in the library when its checked out by replacing it from "true" to "false"
     * @param title: Title of the library book that was checked out 
     */
    public void checkOut(String title) {
      this.collection.replace(title, false);
    }

    /**
     * States that the existing title is back in the library after its been returned by replacing it from "false" to "true"
     * @param title: Title of the library book that was returned 
     */
    public void returnBook(String title) {
      this.collection.replace(title, true);
    }

    /**
     * Checks to see if a library book is in the library by checking the hashtable
     * @param title: Title of the library book that is being searched for 
     * @return: The title of the library book that is being searched for 
     */
    public boolean containsTitle(String title) {
      return this.collection.containsKey(title);
    }

    /**
     * Checks the status of whether a book is avaliable, by stating either "true" (if it is) or "false" (if its not)
     * @param title: Title of the book that is being checked for avalibility
     * @return: True or false, depending on the status of the book
     */
    public boolean isAvailable(String title) {
      return this.collection.replace(title, true);
    }

    /** 
     * Prints out all of the books in the library 
     */
    public void printCollection() {
      System.out.println(collection);
    }

    /**
     * Creates a new library named Neilson, with the given parameters listed above  
     */
    public static void main(String[] args) {
      Library Neilson = new Library("neilson", "7 Neilson Drive", 4);
    }
  
  }