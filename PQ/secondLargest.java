package PQ;


    import java.util.Arrays;

    public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element in the array: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}


