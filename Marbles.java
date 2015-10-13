/*
 * Project: Marbles.java
 * Description: A String array containing the names of marble colors
 * Name: Juyoung Lee
 * Date: Oct 13, 2015
 */

public class Marbles {
  
  public static void main( String[] args ) {
    
    // 1. Create a String array to hold the names of marble colors
    // 2. Assign "names" to the String array indecies
    // 3. Print the String array names
    
    String[] marbleColors = { "red", "orange", "yellow", "purple", "pink" };
    for( int p = 0; p < marbleColors.length; p++ ) {
      System.out.println( marbleColors[p] );
    }
    
  } // End main()
  
} // End class Marbles