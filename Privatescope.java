import java.util.Scanner;
class Add1{
    private int a,b,c;
    private void sum(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
    }
    public void display()
    {
        sum();
        System.out.println("Sum="+c);
    }
}
public class Privatescope
    {
    public static void main(String args[])
    {
        Add1 obj=new Add1();
        obj.display();
    }
}

