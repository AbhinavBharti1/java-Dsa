package PQ;


public class checkSpecificElemnt {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int target = 3;
            boolean contains = containsElement(arr, target);
            if (contains) {
                System.out.println("Array contains the element " + target);
            } else {
                System.out.println("Array does not contain the element " + target);
            }
        }
        
        public static boolean containsElement(int[] arr, int target) {
            for (int num : arr) {
                if (num == target) {
                    return true;
                }
            }
            return false;
        }
    }
    

