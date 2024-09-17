import java.util.*;

public class sep17 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {

    }

    static void tabel7(){
        int[] tabel = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};

        for(int number: tabel) {
            System.out.println(number);
        }
    }

    static int[] tabel(int _tabel, int _length)
    {
        int[] number = new int[_length];
        for (int i = 1; i <=_length; i++)
        {
            number[i-1] = i*_tabel;
        }
        return number;
    }
    
    static ArrayList<Integer> removeEven(int[] numbers)
    {
        ArrayList<Integer> results = new ArrayList<>();
        for (int number : numbers)
        {
            if (number % 2 != 0) results.add(number);
        }
        return results;
    }
    
    static int[] removeEven2(int[] numbers)
    {
        int [] results = new int[numbers.length];
        int j = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0) 
            {
                results[j] = numbers[i];
                j++;
            }
        }
        return Arrays.copyOf(results, j);
    }
}