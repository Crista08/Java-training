import java.util.Scanner;
class Supermost{
    private int n=3;
    public void dis(){
        System.out.println("the value of supermost class : "+n);
    }
}
class Super extends Supermost{
    protected int i=5;
    public void dis2(){
        System.out.println("The value of super class : "+i);
    }
}
class Sub extends Super{
    int x=7;
    public void dis3(){
        System.out.println("The value of sub class : "+x);
    }
}
class SuperMostClass
{
    public static void main(String args[]){
        Sub obj=new Sub();
        obj.dis();
        obj.dis2();
        obj.dis3();
    }
}
