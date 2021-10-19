/* Lab06a- Recursive Java method that counts the number of occurrences of the character “a” in a string
 * @author: Nashiha Ahmed
 * @version: 1.00/ 28.04.15
 */
public class Lab06a
{
    //main method
    public static void main( String[] args)
    {
        //Print out test values
        System.out.println( "Word: " + "banana\t\t\t" + 
                           "Count of A's: " + countA( "banana"));
        System.out.println( "Word: " + "platypus\t\t\t" + 
                           "Count of A's: " + countA( "platypus"));
        System.out.println( "Word: " + "word \t\t\t" + 
                           "Count of A's: " + countA( "word"));
        System.out.println( "Word: " + "Shayan\t\t\t" +
                           "Count of A's: " + countA( "Shayan"));
        System.out.println( "Word: " + "Nashiha\t\t\t" + 
                           "Count of A's: " + countA( "Nashiha"));
        System.out.println( "Word: " + "Mason\t\t\t" + 
                           "Count of A's: " + countA( "Mason"));
        System.out.println( "Word: " + "Honorificabilitudinitatibus\t" + 
                           "Count of A's: " + countA( "Honorificabilitudinitatibus"));
        System.out.println( "Word: " + "Supercalifragilisticexpialidocious\t" + 
                           "Count of A's: " + countA( "Supercalifragilisticexpialidocious"));
        System.out.println( "Word: " + "Floccinaucinihilipilification\t" + 
                           "Count of A's: " + countA( "Floccinaucinihilipilification"));
        System.out.println( "Word: " + "Antidisestablishmentarianism\t" + 
                           "Count of A's: " + countA( "Antidisestablishmentarianism"));
        
    }
    //end of main method
    //countA method with starting variable S
    public static int countA( String word, int S)
    {
        //Simplest case- if start is the end of the word
        if( S == word.length())
        {
            return 0;
        }
        //if character is a, add 1 to count of As and do again
        else if( word.charAt( S) == 'a' )
        {
            return 1 + countA( word, S + 1);
        }
        //else add 0 to count and do again
        else
        {
            return 0 + countA( word, S + 1);
        }
    }
    //countA method without S
    public static int countA( String word)
    {
        return countA( word, 0);
    }
}
