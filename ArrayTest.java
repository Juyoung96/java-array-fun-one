public class ArrayTest {
 
  public static void main ( String[] args ) {
    
    int[] c = new int [ 10 ];
    int j = 1;
    
    for ( int i = 1; i < c.length; i++) {
      c[i] = j;
      j += 2;
      System.out.print( c[i] + ", " );
    }
    
    String[] pizzaToppings = { "pepperoni", "cheese", "olives", "sausage", "onions" };
    for( int i = 0; i < pizzaToppings.length; i++) {
     System.out.println( pizzaToppings[i] ); 
    }
    change( pizzaToppings );
    System.out.println( "New topping: " + pizzaToppings[0] );
    
  } // End main()
  
  public static void change( String[] s ) {
    s[0] = "sardines";
  } // End change()
  
} // End class ArrayTest