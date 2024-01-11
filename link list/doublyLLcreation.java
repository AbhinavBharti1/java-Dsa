import java.util.*;

public class doublyLLcreation
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
        int data,n;
        do{
        System.out.print("Enter data = ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            head.prev = new_node ;
            new_node.next = head ;
            head = new_node;
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
        doublyLLcreation li = new  doublyLLcreation();
        li.creation(sc);
        li.traverse();
    }
}

