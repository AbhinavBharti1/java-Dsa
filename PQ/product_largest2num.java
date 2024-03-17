package PQ;

    import java.util.Arrays;

public class product_largest2num{
    public static int findProductOfTwoLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.print("Array should contain at least two elements");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the product of the last two elements (largest two numbers)
        return arr[arr.length - 1] * arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 35, 15};
        int product = findProductOfTwoLargest(arr);
        System.out.println("Product of the two largest numbers in the array: " + product);
    }
}


