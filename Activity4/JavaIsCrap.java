import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaIsCrap 
{
    public static double mean(int[] numbers) 
    {
        double sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double median(int[] numbers) 
    {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) 
        {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } 
        else 
        {
            return numbers[middle];
        }
    }

    public static int mode(int[] numbers) 
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) 
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = numbers[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() > maxCount) 
            {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static int range(int[] numbers) 
    {
        int min = Arrays.stream(numbers).min().orElse(0);
        int max = Arrays.stream(numbers).max().orElse(0);
        return max - min;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements are in the array? ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("List down the elements in the array");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Mean: " + mean(numbers));
        System.out.println("Median: " + median(numbers));
        System.out.println("Mode: " + mode(numbers));
        System.out.println("Range: " + range(numbers));
    }
}
