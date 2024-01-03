import java.util.*;
public class Array1dInsertion
{
    public static void main(String a[]){
        int n,i,m,d;
        Scanner s = new Scanner(System.in);
        System.out.println("enter total number of element");
        n= s.nextInt(); 
        int b[] = new int[n];
        int c[] = new int[n+1];

System.out.println("enter elements");
        for( i = 0 ; i<n ; i++)
        {
            b[i] = s.nextInt();

        }
        System.out.println("enter index position");
        m= s.nextInt();
         System.out.println("enter value to insert");
        d= s.nextInt();

        for( i = 0 ; i<n+1 ; i++)
        {
            if(i<m){
                c[i]=b[i];
            }
            else if(i==m){
                c[i]=d;
            }
            else
            {
                 c[i]=b[i-1];
            }


        }

        System.out.println("print array");

        for(int j = 0 ; j<n+1 ; j++)
        {
            System.out.println(c[j]);
        }

    }
}