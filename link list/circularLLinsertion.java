 import java.util.*;

public class circularLLinsertion
{
    static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation()
    {
        int data,m,p,n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Enter data = ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
            new_node.next = head ;
        }
        else{

           System.out.print("enter 1 to insert at beginning, enter 2 to insert in middle , enter 3 to insert at end");
            m= sc.nextInt();
            switch (m) {
                case 1:
                    new_node.next = head ;
                    head=new_node;
                    tail.next = head;
                    break;
                case 2:
                   System.out.println("enter position of node to be inserted");
                   p = sc.nextInt();
                   Node temp1=head;
                   for(int i = 0; i<(p-1);i++){
                    temp1= temp1.next;
                   }
                   new_node.next=temp1.next;
                   temp1.next=new_node;
                    break;
                 case 3:
                    tail.next = new_node;
                    tail = new_node;
                    new_node.next = head;
                    break;
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
        else
        {
            do
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            while(temp!=head);
        }
    }

    public static void main(String[] args) {
        circularLLinsertion  li = new  circularLLinsertion();
        li.creation();
        li.traverse();
    }
}

 
 