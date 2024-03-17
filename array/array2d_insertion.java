import java.util.Scanner;

public class array2d_insertion {
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

        System.out.println("row index:");
        int row = scanner.nextInt();
        System.out.println("column index:");
        int col = scanner.nextInt();

        System.out.println("Enter the value to insert:");
        int valueToInsert = scanner.nextInt();

        insertValue(arr, row, col, valueToInsert);

        for (int[] rowArray : arr) {
            for (int value : rowArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void insertValue(int[][] arr, int row, int col, int value) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length) {
            System.out.println("Invalid row or column index.");
            return;
        }

        arr[row][col] = value;
    }
}
