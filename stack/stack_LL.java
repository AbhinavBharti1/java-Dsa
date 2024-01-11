package stack;
import java.util.*;

class stackfunction{
    static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    Node top = null;

    void push(Scanner sc){
        System.out.print("Enter data = ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (top != null) {
            new_node.next = top;
        }
        top=new_node;
    }

    void pop(){
        if(top == null){
            System.out.println("underflow= stack is empty");
        }
        else{
            Node temp = top;
            temp = temp.next;
            top=temp;
            System.out.println("item popped");
        }
    }
    void display(){

        { Node temp=top;
            if(top==null)
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

class stack_LL {
    public static void main(String[] args)
    { int d;
        Scanner sc =new Scanner(System.in);
        stackfunction st = new stackfunction();
        int e;

        do{
            System.out.println("press 1 to push, 2 to pop, 3 to display = ");
            d = sc.nextInt();
            switch(d){
                case 1:
                    st.push(sc);
                    break;
                case 2:
                    st.pop();
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
