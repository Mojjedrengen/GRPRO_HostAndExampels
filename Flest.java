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
            String in = s.nextLine().toLowerCase();
            for (String drikvare : drikkevarerArr){
                if (in.contains(" "+drikvare+" ")||
                    in.contains(" "+drikvare+".")||
                    in.contains(" "+drikvare+",")||
                    in.contains(" "+drikvare+"?")||
                    in.contains(" "+drikvare+"!")||
                    in.contains(" "+drikvare)    ||
                    in.equals(drikvare)          ||
                    in.contains(drikvare+" ")) {
                    if (!notesMap.containsKey(drikvare)) {
                        notesMap.put(drikvare, 1);
                        if (highest == 0) highest = 1;
                    }
                    else {
                        int note = notesMap.get(drikvare);
                        notesMap.put(drikvare, note+1);
                        if (highest <= note+1) highest = note+1;
                    }
                    break;
                } 
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


