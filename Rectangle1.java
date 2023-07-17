class Rectangle1
{
public static void main(String[] args)
{
    Test r=new Test();
    System.out.println(r.area(4.5,2.5));
    System.out.println(r.perimeter(4.5,2.5));
    Triangle t=new Triangle();
    System.out.println(t.area(2.5,4.5));
    System.out.println(t.perimeter(4.5,2.5,4.5));
}
}
class Test
{
public double area(double length,double breadth)
{
    return length*breadth;
}
public double perimeter(double length,double breadth)
{
    return 2*(length+breadth);
}
}
class Triangle
{
public double area(double b,double height)
{
    return (b*height)/2;
}
public double perimeter(double a,double b,double c)
{
    return a+b+c;
}
}
