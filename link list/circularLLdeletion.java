import java.util.*;

public class circularLLdeletion
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
        System.out.println();
    }

    public void delete()
    {
        int l,z,y;
        System.out.println("if yo want to delete an element press 1 ");
        Scanner cs = new Scanner(System.in);
        l=cs.nextInt();
        if(l==1)
            System.out.print("enter 1 to delete at beginning, enter 2 to delete in middle , enter 3 to delete at end");
        z = cs.nextInt();
        switch (z) {
            case 1:
                Node temp = head;
                temp = temp.next;
                head=temp;
                tail.next = head ;
                break;
            case 2:
                System.out.println("enter position of node to be deleted");
                y = cs.nextInt();
                Node temp4=head;
                Node temp5 = temp4.next;
              for(int k = 0 ; k <= (y-2) ; k++)
                {
                    temp4 = temp5;
                    temp5 = temp5.next;
                }
                temp4.next = temp5.next;


                break;
            case 3:
                Node temp2=head;
                Node temp3 = temp2.next;
                while(temp3.next!=head)
                {
                    temp2 = temp3;
                    temp3 = temp3.next;
                }
                temp2.next = head;
                tail = temp2;
                break;
        }

    }

    

    public static void main(String[] args) {
        circularLLdeletion  li = new  circularLLdeletion();
        li.creation();
        li.traverse();
        li.delete();
        li.traverse();
    }
}
