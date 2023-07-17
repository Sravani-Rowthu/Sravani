import java.util.Scanner;
class Bill
{
public static void main(String[] args)
{
int a;
int t;
Scanner s=new Scanner(System.in);
int cmr=s.nextInt();
int pmr=s.nextInt();
char ch=s.next().charAt(0);
int u=cmr-pmr;
switch(ch)
{
case 'D':if(u>200)
         {
             t=u-200;
             a=t*3+100*2+100*1;
             System.out.println(a);
             break;
         }
         else if(u>100)
         {
             t=u-100;
             a=t*2+100*1;
             System.out.println(a);
             break;
         }
         else
         {
             a=u*1;
             System.out.println(a);
             break;
         }
         //System.out.println(a);
case 'C':if(u>200)
         {
             t=u-200;
             a=t*6+100*4+100*2;
             System.out.println(a);
             break;
         }
         else if(u>100)
         {
             t=u-100;
             a=t*4+100*2;
             System.out.println(a);
             break;
         }
         else
             {
             a=u*2;
             System.out.println(a);
             break;
             }
case 'I':if(u>200)
         {
             t=u-200;
             a=t*9+100*6+100*3;
             System.out.println(a);
             break;
         }
         else if(u>100)
         {
             t=u-100;
             a=t*6+100*3;
             System.out.println(a);
             break;
         }
         else
             {
             a=u*3;
             System.out.println(a);
             break;
             }
default:System.out.println("enter correct choice");
}
}
}