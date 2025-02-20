import java.util.Scanner;
class Student
{
    String name;
    int reg_no;
    void details(String n,int r)
    {
        name=n;
        reg_no=r;
        System.out.println(name);
        System.out.println(reg_no);
    }
}
public class Classexample
{
    public static void main(String a[])
    {
        Student g1=new Student();
        Scanner in=new Scanner(System.in);
        System.out.print("Student name=");
        String name=in.nextLine();
        System.out.print("Student regno=");
        int reg_no=in.nextInt();
        g1.details(name,reg_no);
    }
}