
/**
 * Write a description of class MyArrayListDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayListDemo
{
    public static void test1() {
        MyArrayList list = new MyArrayList();
        
        list.add("hej");
        list.add("med");
        list.add("dig");
        
        String value = list.get(1);
        System.out.println(value);
        // test metoden 'size':
        int size = list.size();
        System.out.println(size);
    }
    public static void test2(int n) {
        MyArrayList list;
        list = new MyArrayList();
        for (int i=0; i<n; i++) {
        list.add2("" + i);
        }
    }
    static long timeTest2() {
        // start stopur (i ms)
        long time = System.currentTimeMillis();
        test2(100_000);
        return System.currentTimeMillis()-time;
        // kald test2(N)
        // stop stopur (i ms)
        // returnér tiden (i ms)
    }
    public static void test3(int n) {
        MyArrayList list;
        list = new MyArrayList();
        for (int i=0; i<n; i++) {
        list.add3("" + i);
        }
    }
    static long timeTest3() {
        // start stopur (i ms)
        long time = System.currentTimeMillis();
        test3(100_000);
        return System.currentTimeMillis()-time;
        // kald test2(N)
        // stop stopur (i ms)
        // returnér tiden (i ms)
    }
    
    public static void add3vadd2(){
        System.out.println("add2: "+timeTest2());
        System.out.println("add3: "+timeTest3());
    }
}
