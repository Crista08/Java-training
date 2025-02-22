import java.util.Scanner;
class Shape
{
    protected double area;
    public void calculate_area()
    {
      System.out.println("Area of shapes");
    }
}
class square extends Shape{
    private int a;
    public void calculate_area()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        area=a*a;
        System.out.println("Area of square="+area);
    }
}
class circle extends Shape{
    private double r;
    public void calculate_area()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of r:");
        float r=in.nextFloat();
        area=3.14*r*r;
        System.out.println("Area of circle="+area);
    }
}
class CalculatedArea{ 
public static void main (String[] args) {
    Shape s=new Shape();
    s.calculate_area();
    Shape s1=new square();
    s1.calculate_area();
    Shape s2=new circle();
    s2.calculate_area();
    }
}