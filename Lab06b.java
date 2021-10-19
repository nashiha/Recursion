/* Lab06b- Recursive java method that returns true if the array is sorted from smallest to largest, and false otherwise.
 * @author: Nashiha Ahmed
 * @version: 1.00/ 28.04.15
 */
public class Lab06b
{
    //main method- Test values
    public static void main( String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println( "Array: [1, 2, 3, 4, 5, 6]. Sorted?: " + isSorted( a, 6));
        int[] b = {1, 7, 3, 4, 5, 6, 9, 10, 28};
        System.out.println( "Array: [1, 7, 3, 4, 5, 6, 9, 10, 28]. Sorted?: " + isSorted( b, 9));
        int[] c = {1, 2, 3, 4, 5, 6, 9, 10, -1, 3};
        System.out.println( "Array: [1, 2, 3, 4, 5, 6, 9, 10, -1, 3]. Sorted?: " + isSorted( c, 10));   
    }
    //isSorted method- recursive method to determine whether array is in order
    public static boolean isSorted( int[] x, int N)
    {
        //If 1 or no elements then isSorted- Simplest
        if( N == 0 || N == 1)
            return true;
        //If predecessing number is bigger than number then !isSorted
        else if( x[ N - 1] < x[ N - 2])
            return false;
        //recursive call
        return isSorted( x, N - 1);
   
        //same method with starting index instead of number of elements to process
//        if( N + 1 < x.length)
//        {
//            if( x[ N] < x[ N + 1])
//            {
//                return isSorted( x, N + 1);
//            }
//        else 
//            return false;
//        }
//        return true;
 
    }
}
