/*
 * In the class below, write two methods:
 * 
 * First, method resize() to expand the existing array data by doubling its size.
 *
 * Second, method contains(String string) that returns true if String string already
 * exists in array data and false otherwise.
 *
 * Your code must have comments explaining what is done and why it is done in the
 * way you do it.
 *
 * DO NOT USE any tools that require to be imported, ie, do not use the import command.
 *
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */
public class DynamicArray {

    /** The underlying array for this object */
    private String[] data;

    /** Currently available position in array data */
    private int position;

    /** Constant with default size */
    private static final int DEFAULT_SIZE = 10;

    /**
     * Basic constructor for the object
     * @param size initial size of array data
     */
    public DynamicArray(int size) {
        this.data = new String[size];
        this.position = 0;
    } // basic constructor

    /** Default constructor */
    public DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /**
     * Adds a new item to array data after ensuring there is 
     * sufficient room by resizing the array if necessary.
     * @param string new item to add to array
     */
    public void add(String string) {
        // Make sure there is room in array data
        if (this.position == this.data.length) {
            resize();
        }
        // Now array has room for more elements.
        this.data[this.position] = string;
        this.position++;
    } // method add

    public resize(int new_size) { // Initialize new method with a new size which is doubled
        int new_size = (int DEFAULT_SIZE * 2); // Take the default size and double it
    }

    public contains(String new_string) { // Method for removing identical strings
        if (String new_string == this.data) { // if statement for if the new string is already in the data
            return true // returns true if string is in data
        }
        else {
            return false // returns false if string isn't in data 
        }
    
} // class DynamicArray
