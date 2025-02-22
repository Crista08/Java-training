import java.util.Scanner;
class Super{
    static void disp(){
        System.out.println("In super class");
    }
}
class Sub extends Super{
    static void disp(){
        System.out.println("In sub class");
    }
}
class Superclass{
    public static void main(String args[]){
        Super obj=new Sub();
        obj.disp();
    }
}