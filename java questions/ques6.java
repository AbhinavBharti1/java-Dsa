public import java.util.*;

public class ques6 {

    
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
      
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
         
            return arr[n / 2];
        }
    }

    
    public static List<Integer> calculateMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

       
        for (int num : arr) {
            int freq = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, freq);
            maxFrequency = Math.max(maxFrequency, freq);
        }

        
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        return modes;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

        System.out.println("Array: " + Arrays.toString(arr));

     
        double mean = calculateMean(arr);
        System.out.println("Mean: " + mean);


        double median = calculateMedian(arr);
        System.out.println("Median: " + median);

        List<Integer> mode = calculateMode(arr);
        System.out.println("Mode: " + mode);
    }
}
 