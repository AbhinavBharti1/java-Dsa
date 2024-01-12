package queue;
import java.util.*;
class queuefunction{
    int n= 10;
    int []a = new int[n];
    int f=-1, r=-1;

public void enqueue(Scanner sc){
if(r==(n-1)){
    System.out.println("queue is full");
}
else{   
    System.out.println("Enter data");
    int data = sc.nextInt();
    if(f==(-1) && r==(-1)){
    f=0;
    r=0;   
    a[r]=data;
}
else {
  
    r++;
    a[r]= data ;
}
}

}
public void dequeue(){
    if(f==(-1) && r==(-1)){
        System.out.println("queue is full");
    }
    else{

        f++;
    }
    
}
public void display(){
    for(int i = f;i<=r; i++)
    {
System.out.println(a[i]);
    }
}
}

class queue_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        queuefunction qf = new queuefunction();
        int e,d;

        do{
            System.out.println("press 1 to enqueue, 2 to dequeue, 3 to display = ");
            d = sc.nextInt();
            switch(d){
                case 1:
                    qf.enqueue(sc);
                    break;
                case 2:
                    qf.dequeue();
                    break;
                case 3:
                    qf.display();
                    break;
            }
            System.out.println("enter 0 to go back to main menu ");
            System.out.println("press any key to exit");
            e = sc.nextInt();
        }while(e==0);
        System.out.println("exit succesfully ");

    }
}