import java.util.Scanner;
abstract class Circle_without_inheritence{
    static double area,circumference,r;
    static void disp(){
        Scanner in=new Scanner(System.in);
        System.out.print("Radius = ");
        r=in.nextDouble();
    }
    static void calc_area(){
        area=3.14*r*r;
        System.out.println("Area="+area);
        }
        static void calc_cir(){
        circumference=2*3.14*r*r;
        System.out.println("Circumference = "+circumference);
    }
    static public void main(String args[]){
        Circle_without_inheritence.disp();
        Circle_without_inheritence.calc_area();
        Circle_without_inheritence.calc_cir();
    }
}