public class ques8 {
    
    private static void merge(int[] arr, int left, int mid, int right) {
        
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

       
        System.arraycopy(arr, left, leftArr, 0, mid - left + 1);
        System.arraycopy(arr, mid + 1, rightArr, 0, right - mid);

        int i = 0, j = 0, k = left; 

        
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; 
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

           
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
