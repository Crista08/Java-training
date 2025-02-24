import java.util.Scanner;
abstract class Circle{
    protected double area;
    abstract void calc_area();
}
class AreaAbstract extends Circle 
{
    private double r;
    public AreaAbstract(){
        Scanner in=new Scanner(System.in);
        System.out.print("The value of r : ");
        r=in.nextDouble();
    }
    void calc_area(){
        area=3.14*r*r;
        System.out.println("Area = "+area);
    }
    public static void main(String args[]){
        AreaAbstract obj=new AreaAbstract();
        obj.calc_area();
    }
}