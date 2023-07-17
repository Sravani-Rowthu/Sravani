import java.util.Scanner;
class Stack
{
  int[] s= new int[5];
  int top;
  Stack()
  {
   top=-1;
  }
  void push(int element)
  {
    top=top+1;
    s[top]=element;
    System.out.println("stack to be inserted:"+s[top]);
   }
  void pop()
  {
    System.out.println("stack to be deleted :"+s[top]);
    top=top-1;
   }

  void show()
  {
   if(top==-1)
   {
    System.out.println("stack is empty");
   }
   else
   {
    for(int i=top;i>=0;i--)
    {
     System.out.println(s[i]);
    }
   }
  }
  public static void main(String[] args)
  {
    Stack a= new Stack();
    while(1!=0)
   {
    Scanner sc =  new Scanner(System.in);
    int ch= sc.nextInt();
    switch(ch)
    {
     case 1:
         int x = sc.nextInt();
         a.push(x);
         break;
    case 2:
         a.pop();
         break;
    case 3:
         a.show();
         break;
    case 4:
         System.out.println("exit");
    default:
         System.out.println("enter correct choice");
    }

 

  }
}
}