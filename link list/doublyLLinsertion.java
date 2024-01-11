import java.util.*;

public class doublyLLinsertion
{
    static class Node{
        int data ;
        Node next;
        Node prev ;
        Node(int data)
        {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(Scanner sc)
    {
        int data,n,m,p;
       
        do{
        System.out.print("Enter data = ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            System.out.print("enter 1 to insert at beginning, enter 2 to insert in middle , enter 3 to insert at end");
            m= sc.nextInt();
            switch (m) {
                case 1:
                    new_node.next=head;
                    head.prev = new_node;
                    head=new_node;
                    break;
                case 2:
                   System.out.println("enter position of node to be inserted");
                   p = sc.nextInt();
                   Node temp1=head;
                   Node temp2 = temp1.next;
                   for(int i = 0; i<(p-1);i++){
                    temp1= temp2;
                    temp2=temp2.next;
                   }
                   new_node.next=temp2;
                   new_node.prev= temp1;
                   temp1.next=new_node;
                   temp2.prev= new_node;
                    break;
                 case 3:                   
                    {
                       tail.next=new_node;
                       new_node.prev = tail;
                       tail = new_node;
                    }
            }
        }
        System.out.print("Do you want to continue press 1 = ");
        n=sc.nextInt();
    }
    while(n==1);

    }
    public void traverse()
    { Node temp=head;
        if(head==null)
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLLinsertion li = new  doublyLLinsertion();
        li.creation(sc);
        li.traverse();
    }
}

