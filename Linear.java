import java.util.Scanner;
class Linear
{
public static void main(String[] args)
{
int count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
for(int i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
int key=s.nextInt();
for(int i:a)
{
if(i==key)
{
count++;
break;
}
}
if(count==1)
System.out.println("found");
else
System.out.println("not found");
}
}