public class ques7 {
    public static void insertionSort(int[] arr) {
       
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; 
            int j = i - 1;

            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; 
                j--; 
            }

            
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 9, 1};

        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        
        insertionSort(arr);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
