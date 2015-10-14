/*
 * Project: ArrayTwoDFun.java
 * Description: Learning 2D arrays
 * Name: Juyoung Lee
 * Date: Oct 14, 2015
 */

public class ArrayTwoDFun {
 
  public static void main( String[] args ) {
    
    int[][] a = { { 1, 3, 5, 7, 9}, {11, 13, 15, 17, 19}, };
    int total  = 0;
    
    System.out.println( a[0][4] );
    
    for( int i=0; i<a.length; i++ ) {
      for( int j=0; j<a[i].length; j++ ) {
        total += a[i][j];
        System.out.println( "Sum now is: " + total );
      }
    }
    
    
  } // END main()
  
} // End class