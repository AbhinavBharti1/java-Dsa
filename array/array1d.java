import java.util.*;
public class array1d
{
    public static void main(String a[]){
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter total number of element");
        n= s.nextInt(); 
        int b[] = new int[n];

        for( i = 0 ; i<n ; i++)
        {
            b[i] = s.nextInt();

        }
        System.out.println("print array");

        for(int j = 0 ; j<n ; j++)
        {
            System.out.println(b[j]);
        }

    }
}