
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int age;
    
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void birthday() {
        this.age++;
    }
    
    public void display() {
        System.out.println(this.name+" ("+this.age+")");
    }
}
