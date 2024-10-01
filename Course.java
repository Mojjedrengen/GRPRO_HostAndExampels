
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashSet;
import java.util.Set;


public class Course
{
   private Set<Student19> students;
   
   public Course() {
       this.students = new HashSet<Student19>();
   }
   public Course(Student19[] students) {
       this.students = new HashSet<Student19>();
       for (Student19 student : students) {
           this.students.add(student);
       }
   }
   
   public void addStudent19(Student19 student) {
       this.students.add(student);
   }
   public void addStudent19s(Student19[] students)
   {
       for (Student19 student : students) {
           this.students.add(student);
       }
   }
   
   public void showStudent19s() {
       System.out.println("Antal studerende: "+this.students.size());
       for (Student19 student : this.students) {
           System.out.print("- ");
           student.display();
       }
   }
}
