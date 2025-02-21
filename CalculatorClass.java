import java.util.Scanner;
class Calculator
{
    public void add()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the add value of a : ");
        int a=in.nextInt();
        System.out.print("Enter the add value of b : ");
        int b=in.nextInt();
        int c=a+b;
        System.out.println("the value of add = "+c);
    }
    public int subtract(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sub value of a : ");
        int a=in.nextInt();
        System.out.print("Enter the sub value of b : ");
        int b=in.nextInt();
        int c=a-b;
        return c;
    }
    public void product(int a,int b)
    {
       int c=a*b;
        System.out.println("The product is : "+c);
    }
    public int division(int a,int b)
    {
        int c=a/b;
        return c;
    }
}
    class CalculatorClass
    {
        public static void main(String args[]){
        Calculator obj=new Calculator();
        obj.add();
        int b=obj.subtract();
        System.out.println("Sub = "+b);
        obj.product(8,9);
        int d=obj.division(10,2);
        System.out.println("Division = "+d);
    }
}












