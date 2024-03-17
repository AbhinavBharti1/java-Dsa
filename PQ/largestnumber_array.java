package PQ;

public class largestnumber_array {
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
          System.out.println("Array is empty or null");
        }

        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 35, 15};
        int largest = findLargest(arr);
        System.out.println("The largest number in the array is: " + largest);
    }
}
