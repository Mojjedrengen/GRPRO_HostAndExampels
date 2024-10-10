
/**
 * Write a description of class MyAbstractList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class MyAbstractList implements MyList
{
    protected int size;
    
    MyAbstractList(){
        size = 0;
    }
    
    public String get(int index) {
        if (0 <= index && index < size) return "true";
        else {
            System.out.println("Out of bounds");
            return null;
        }
    }
    
    public int size(){
        return this.size;
    }
}
