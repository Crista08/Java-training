import java.util.Scanner;
interface Interfaceclass{
    static int r=0;
    static void display(){
        System.out.println("Static method");
    }
    default void display1(){
        System.out.println("Default method");
    }
}
public class Interface implements Interfaceclass{
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
    System.out.print("The value of a : ");
    int r = in.nextInt(); 
    float area=3.14f*r*r;
    System.out.println("the value of area = "+area);
    Interface obj=new Interface();
    obj.display1();
    Interfaceclass.display();
    }
}