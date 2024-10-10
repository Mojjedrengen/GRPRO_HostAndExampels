
/**
 * Write a description of class MyArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayList extends MyAbstractList
{
    private String[] array;
    
    public MyArrayList()
    {
        super();
        this.array = new String[10];
    }
    
    public String get(int index) {
        if (0 <= index && index < size){
            return this.array[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }
    
    public void add(String value) {
        if (this.size >= this.array.length)
        {
            String[] newArray = new String[this.array.length*2];
            
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
            this.array[this.size] = value;
            this.size++;
        } else {
            this.array[this.size] = value;
            this.size++;
        }
    }
}
