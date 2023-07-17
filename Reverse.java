import java.util.Scanner;
class Reverse
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
for(int i=a.length()-1;i>=0;i--)
{
System.out.print(a.charAt(i));
}
}
}