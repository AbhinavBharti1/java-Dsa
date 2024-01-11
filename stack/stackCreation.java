package stack;
import java.util.*;

class stackfunction{
   int  top = -1 ;
   int x = 10;
int a[] = new int[x];

void push(Scanner sc){
   if(top==(x-1)){
     System.out.println("overflow = Stack is full");
   }
   else{
        System.out.println("Enter data");
        int b = sc.nextInt();
        top++;
        a[top]= b;
        System.out.println("Item pushed");
    }
   }
   void pop(){
    if(top==(-1)){
         System.out.println("underflow= stack is empty");
    }
    else{
        top--;
         System.out.println("item popped");
    }
   }
   void display(){
    for(int i = top ; i >= 0;i-- )
    {
         System.out.println(a[i]);
    }
   }

}

class stackCreation {
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
    System.out.println("exit succesfully ");
     
    }
}
