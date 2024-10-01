import java.util.List;
import java.util.ArrayList;

public class University {
    List<Person> people;
    
    public University() {
        people = new ArrayList<Person>();
    }
    
    public void addPerson(Person person) {
        people.add(person);
    }

    public void show() {
        for (Person person : people) {
            person.display();
        }
    }
}
