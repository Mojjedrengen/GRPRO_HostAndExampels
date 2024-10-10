import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.PrintWriter;

/**
 * Write a description of class Oct10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oct10
{
    static void avgGrade() throws Exception {
        File file = new File("./karakterer.txt");
        Scanner s = new Scanner(file);
        List<Integer> grades = new ArrayList<>();
        while (s.hasNextInt()) {
            grades.add(s.nextInt());
        }
        
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        System.out.println(Math.round(((float)sum/grades.size())*100)/100f);
    }
    
    static void whoLikesWhatFood() throws Exception {
        File file = new File ("./favorite-food.txt");
        Scanner s = new Scanner(file);
        Map<String, List<String>> whoLikesFood = new HashMap<>();
        
        while(s.hasNextLine()) {
            List<String> names;
            String[] line = s.nextLine().toLowerCase().split(" ");
            names = whoLikesFood.getOrDefault(line[1], new ArrayList<>());
            names.add(line[0].substring(0,1).toUpperCase()+line[0].substring(1));
            whoLikesFood.put(line[1], names);
        }
        
        whoLikesFood.forEach((food,names) -> {
            System.out.println(food+": "+names);
        });
    }
    
    static void whoGotWhichGrade() throws Exception {
        File file = new File("./karakterer2.txt");
        Scanner s = new Scanner(file);
        Map<String, List<String>> allgrades = new HashMap<>();
        
        while(s.hasNextLine()) {
            List<String> names = new ArrayList<>();
            String[] line = s.nextLine().split(" ");
            names = allgrades.getOrDefault(line[1], new ArrayList<>());
            names.add(line[0]);
            allgrades.put(line[1], names);
        }
        
        
        PrintWriter writer = new PrintWriter("./karakterer2-output.txt");
        allgrades.forEach((k,v) -> {
            System.out.println("-"+k+": "+v);
            writer.print(k+": ");
            for (String name : v) {
                writer.print("'"+name+"', ");
            }
            writer.println();
        });
        writer.close();
    }
}
