import java.util.Scanner;
class Tax
{
public static void main(String[] args)
{
double t;
int y;
double a;
Scanner s=new Scanner(System.in);
int m=s.nextInt();
y=m*12;
System.out.println(y);
if(y>1000000)
{
t=y-1000000;
a=t*30/100+500000*20/100+250000*10/100;
System.out.println(a);
}
else if(y>500000)
{
t=y-500000;
a=t*20/100+250000*10/100;
System.out.println(a);
}
else if(y>250000)
{
t=y-250000;
a=t*10/100;
System.out.println(a);
}
else
{
a=0;
System.out.println(a);
}
}
}