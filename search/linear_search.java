package search;

public class linear_search {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; 
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
            int target = 12;
            int index = linearSearch(arr, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        }
    }
    

