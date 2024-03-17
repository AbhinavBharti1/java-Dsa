package PQ;


    import java.util.Arrays;

    public class sort_array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println("Original array:");
        printArray(arr);
        
        sortArray(arr);
        
        System.out.println("Sorted array in ascending order:");
        printArray(arr);
    }
    
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

