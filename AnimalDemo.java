import java.util.Random;

/**
 * Write a description of class AnimalDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalDemo
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            test();
        }
    }
    private static void test() {
        Animal a = (new Random().nextBoolean()) ? new Dog() : new Cat();
        a.speak();
    }
}
