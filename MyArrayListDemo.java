import java.util.Random;

/**
 * Write a description of class MyArrayListDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayListDemo
{
    public static void test1() {
         MyList list = (new Random().nextBoolean()) ? new MyArrayList() : new MyLikedList();
         
    }
}
