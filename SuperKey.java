import java.util.Scanner;
class Super1{
    int x;
    public Super1(){
        x=10;
    }
    public void display(){
        System.out.println("Inside Superclass & x + "+x);
    }
}
class Sub1 extends Super1{
    int x;
    public Sub1()
    {
        super();
        x=100;
    }
    public void display()
    {
        System.out.println("Subclass & x "+x);
        System.out.println("Super class & x "+super.x);
        super.display();
    }
}
class SuperKey{
public static void main(String args[]){
    Sub1 obj=new Sub1();
    obj.display();
} 
}