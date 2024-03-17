
    import java.util.Scanner;

    public class array2d_deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at index (" + i + ", " + j + "): ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("row index");
        int row = scanner.nextInt();

        System.out.println("column index");
        int col = scanner.nextInt();

        deleteValue(arr, row, col);
        for (int[] rowArray : arr) {
            for (int value : rowArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void deleteValue(int[][] arr, int row, int col) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length) {
            System.out.println("Invalid row or column index.");
            return;
        }

        // Set the value at the specified location to 0 (or any other sentinel value)
        arr[row][col] = 0;
    }
}


