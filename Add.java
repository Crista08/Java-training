import java.util.Scanner;
class Add{
    public int a,b,c;
    public void display()
    {
        System.out.println("Sum=:"+c);
    }
    public static void main(String args[])
    {
        Add obj=new Add();
        Scanner in=new Scanner(System.in);
        obj.a=in.nextInt();
        obj.b=in.nextInt();
        obj.c=obj.a+obj.b;
        obj.display();
    }
}
