package queue;
import java.util.*;

class queuefunction{
    static class Node{
        int data ;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    Node front = null;
    Node rear = null;

    void enqueue(Scanner sc){
        System.out.println("Enter data = ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
       if(front==null)
       {
        front=new_node;
        rear = new_node;
       }
       else{
        rear.next = new_node;   
        rear = new_node;   
    }
    }

    void dequeue(){
       front=front.next;
    }
    void display(){

        { Node temp=front;
            if(front==null)
            {
                System.out.print("link list is not available");
            }
            else{
                while(temp!=null)
                {
                    System.out.print(temp.data + " ");
                    temp=temp.next;
                }
            }
        }

    }

}

class queue_LL {
    public static void main(String[] args)
    { int d;
        Scanner sc =new Scanner(System.in);
        queuefunction st = new queuefunction();
        int e;

        do{
            System.out.println("press 1 to enqueue, 2 to dequeue, 3 to display = ");
            d = sc.nextInt();
            switch(d){
                case 1:
                    st.enqueue(sc);
                    break;
                case 2:
                    st.dequeue();
                    break;
                case 3:
                    st.display();
                    break;
            }
            System.out.println("enter 0 to go back to main menu ");
            System.out.println("press any key to exit");
            e = sc.nextInt();
        }while(e==0);
        System.out.println("exit successfully ");

    }
}
