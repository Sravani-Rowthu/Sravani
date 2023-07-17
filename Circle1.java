class Circle1
{
public static void main(String[] args)
{
    Test t=new Test();
    System.out.println(t.area(4.5));
    System.out.println(t.circumference(4.5));
}
}
class Test
{
public double area(double radius)
{
    return 3.14*radius*radius;
}
public double circumference(double radius)
{
    return 2*3.14*radius;
}
}