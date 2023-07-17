import java.util.Scanner;
class Count
{
public static void main(String[] args)
{
int count=0;
Scanner s=new Scanner(System.in);
String a=s.nextLine();
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
count++;
}
System.out.println(count=count+1);
}
}