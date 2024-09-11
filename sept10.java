import java.util.*;

public class sept10 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(100));
        }
        
        System.out.println("Amount of unique is: "+unique(list));
        
    }
    
    static int unique(ArrayList<Integer> _list) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : _list) {
            set.add(i);
        }
        for (int i : set) {
            System.out.println(i);
        }
        return set.size();
    }
}


