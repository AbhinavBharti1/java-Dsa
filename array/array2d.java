import java.util.*;
public class array2d
{
    public static void main(String a[]){
        int m, n,i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter total number of row");
        n= s.nextInt();
         System.out.println("enter total number of column");
        m= s.nextInt();

        int b[][] = new int[m][n];

        for( i = 0 ; i<m ; i++)
        {
            for(int k = 0 ; k<n ; k++)
            {
            b[i][k] = s.nextInt();
            }

        }
        System.out.println("print array");

        for(int j = 0 ; j<m ; j++)
        {
             for(int l = 0 ; l<n ; l++)
        {
            System.out.print(b[j][l]);
            System.out.print(" ");
        }
                    System.out.println();
        }

    }
}
