//find all pairs of elements in an array whose sum equals a given target value.
import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 7, 8, 9}; 
        int targetSum = 7;
        findPairs(array, targetSum);
    }

    public static void findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            map.put(num, num);
        }
    }
}
