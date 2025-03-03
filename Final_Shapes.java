import java.util.*;
class Shape{
    public void Area(){
        System.out.println("AREA OF SHAPES:");
        System.out.println();
    }
}
class Square extends Shape{
    final int a=4;
    final void sqr(){
        int areas;
        areas=a*a;
        System.out.println("Side : "+a);
        System.out.println("Area of Square : "+areas);
        System.out.println();
    }
}
class Triangle extends Shape{
    final int l=2,b=3;
    final void tri(){
        float areat;
        areat=0.5f*l*b;
        System.out.println("Length of triangle : "+l);
        System.out.println("Breadth of triangle : "+b);
        System.out.println("Area of triangle : "+areat);
        System.out.println();
    }
}
class Rectangle extends Shape{
    final int l=2,b=4;
    final void rec(){
        int arear;
        arear=l*b;
        System.out.println("Length of rectangle : "+l);
        System.out.println("Length of rectangle : "+b);
        System.out.println("Area of rectangle : "+arear);
        System.out.println();
    }
}
class Circle extends Shape{
    final int r=2;
    final void cir(){
        float areac;
        areac=3.14f*r*r;
        System.out.println("Value of radius  : "+r);
        System.out.println("Area of circle : "+areac);
        System.out.println();
    }
}
class Final_Shapes{
    public static void main(String args[]){
        Square obj_s=new Square();
        obj_s.Area();
        obj_s.sqr();
        Triangle obj_t=new Triangle();
        obj_t.tri();
        Rectangle obj_r=new Rectangle();
        obj_r.rec();
        Circle obj_c=new Circle();
        obj_c.cir();
    }
}