/* Lab06d- Recursive method that finds the size of a directory (folder) on your computer's disk
 * @author: Nashiha Ahmed
 * @version: 1.00/ 28.04.15
 */
import java.io.*;
public class Lab06d
{
    //main method- Test data
    public static void main( String[] args)
    {     
        System.out.println( "File path: C:\\Users\\Public\\Music. \nSize: " 
                               + findSize( new File( "C:\\Users\\Public\\Music")));
    }
    //findSize method- recursively finds the size of a directory
    public static long findSize( File directory )
    {
        //if it is a directory than sum the size of the files in the directory
        if( directory.isDirectory())
        {
            long size;
            size = 0;
            File[] files;
            files = directory.listFiles();
            for( int i = 0; i < files.length; i++)
            {
                size = size + findSize( files[i]);
            }
            return size; 
        }
        //if it is not a director then just give the size
        return directory.length();        
    }
}