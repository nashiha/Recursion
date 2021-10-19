/* Lab06c- Recursive method that computse the greatest common divisor (gcd) using Euclid’s algorithm
 * @author: Nashiha Ahmed
 * @version: 1.00/ 28.04.15
 */
public class Lab06c
{
    //main method- test value
    public static void main( String[] args)
    {
        System.out.println( "Greatest Common Divisor of ( 252, 105): " + gcd( 252, 105));
        System.out.println( "Greatest Common Divisor of ( 12, 6): " + gcd( 12, 6));
        System.out.println( "Greatest Common Divisor of ( 9, 99): " + gcd( 9, 99));
        System.out.println( "Greatest Common Divisor of ( 3, 33): " + gcd( 3, 33));
        System.out.println( "Greatest Common Divisor of ( 314157, 0): " + gcd( 314157, 0));
        System.out.println( "Greatest Common Divisor of ( 314157, 628318530): " + gcd( 314157, 628318530));
    }
    //Greatest Common Divisior method using Euclid's algorithm
    public static int gcd ( int x , int y )
    {
        // if y = 0, greatest common divisor is x- Simplest case
        if ( y == 0 )  
        {
            return x;
        }
        else if ( x >= y && y > 0)
        {
            return gcd ( y , x % y );
        }
        //Switch y and x if x < y
        else
        {
            return gcd ( y , x );  
        }
    }
}