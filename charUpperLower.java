
/**
 * Write a description of class charUpperLower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class charUpperLower
{
    public static char upper(char _char) 
    {
        int charInt = _char - 32;
        return (char)charInt;
    }
    
    public static char lower(char _char) 
    {
        int charInt = _char + 32;
        return (char)charInt;
    }
}
