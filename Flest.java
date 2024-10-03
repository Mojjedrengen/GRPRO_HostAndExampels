import java.util.*;

public class Flest 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        String drikkevarer = s.nextLine().toLowerCase();
        String drikkevarerArr[] = drikkevarer.split(" ");
        int n = s.nextInt();
        s.nextLine();
        Map<String, Integer> notesMap = new HashMap<>();
        int highest = 0;
        for (int i = 0; i < n; i++) {
            String[] in = s.nextLine().trim().toLowerCase().replaceAll("[,.!]+", "").split(" ");
            Map<String, Integer> amount = new HashMap<>();
            for (String drikvare : drikkevarerArr){
                for (String word : in) {
                    if (drikvare.equals(word)) {
                        amount.put(word, amount.getOrDefault(word, 0)+1);
                    }
                }
            }
            
            String key = null;
            for (String k : amount.keySet()) {
                if (amount.size() == 0) break;
                if (key == null) key = k;
                if (amount.get(k) > amount.get(key)){
                    key = k;
                }
            }
            notesMap.put(key, notesMap.getOrDefault(key, 0)+1);
            if (highest == 0) {
             highest = 1;
            } else if (key == null) {
                continue;
            } else if (notesMap.getOrDefault(key,0) > highest) {
                highest = notesMap.get(key);
            }
        }
        final int high = highest;
        List<String> highestDrink = new ArrayList<>();
        notesMap.forEach((k,v) -> {
            if (v == high) highestDrink.add(k);
        });
        Collections.sort(highestDrink);
        for (String out : highestDrink) {
            System.out.println(out);
        }
    }
}