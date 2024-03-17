package PQ;

public class sum_array {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int sum = findSum(arr);
            System.out.println("Sum of all elements in the array: " + sum);
        }
        
        public static int findSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    }
    
