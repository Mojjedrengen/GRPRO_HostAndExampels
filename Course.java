
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
   private Set<Student> students;
   
   public Course() {
       this.students = new HashSet<Student>();
   }
   public Course(Student[] students) {
       this.students = new HashSet<Student>();
       for (Student student : students) {
           this.students.add(student);
       }
   }
   
   public void addStudent(Student student) {
       this.students.add(student);
   }
   public void addStudents(Student[] students)
   {
       for (Student student : students) {
           this.students.add(student);
       }
   }
   
   public void showStudents() {
       System.out.println("Antal studerende: "+this.students.size());
       for (Student student : this.students) {
           System.out.print("- ");
           student.display();
       }
   }
}
