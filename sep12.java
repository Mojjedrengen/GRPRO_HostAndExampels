import java.util.*;

public class sep12 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<String> test = new ArrayList<>();
        
        test.add("John");
        test.add("Jane");
        test.add("John");
        test.add("Jane");
        test.add("Jane");
        test.add("John");
        test.add("John");
        test.add("Jane");
        test.add("John");
        test.add("Jane");
        test.add("Jane");
        test.add("John");
        test.add("Max");
        
        System.out.println(reverse(test));
        System.out.println(uniqueNames(test));
        mostOccurences(test);
    }
    
    static ArrayList<String> reverse(ArrayList<String> names) 
    {
        Collections.reverse(names);
        return names;
    }

    static int uniqueNames(ArrayList<String> names) 
    {
        HashSet<String> set = new HashSet<>(names);
        return set.size();
    }

    static void mostOccurences(ArrayList<String> input) 
    {
        if (input.size() <= 0) return;
        HashMap<String, Integer> counter = new HashMap<>();

        for (String value : input)
        {
            int number = counter.getOrDefault(value, 0);
            counter.put(value, number+1);
        }

        int max = 0;
        String maxKey = null;

        for (String key : counter.keySet())
        {
            if (counter.get(key) > max)
            {
                max = counter.get(key);
                maxKey = key;
            }
        }
        System.out.println("'"+maxKey+"' appearing "+max+" times");
    }
}

