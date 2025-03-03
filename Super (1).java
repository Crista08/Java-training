import java.util.*;
class Shape1{
    public void Area(){
        System.out.print("Area of shape");
    }
}
class Rectangle1 extends Shape1{
    float length ,breadth;
    public Rectangle1(float l,float b)
    {
        this.length=l;
        this.breadth=b;
    }
    @Override
    public void Area()
    {
        float area=length*breadth;
        System.out.print("Area of rectangle : "+area);
    }
}
class Super
{
    public static void main(String[] args)
    {
        Rectangle1 r = new Rectangle1(12.0f,13.0f);
        r.Area();
    }
}