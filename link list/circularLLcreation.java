import java.util.*;

public class circularLLcreation 
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
        int data,n;
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
            new_node.next=head;
            head = new_node;
            tail.next = head ;
            
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
        circularLLcreation  li = new  circularLLcreation();
        li.creation();
        li.traverse();
    }
}
