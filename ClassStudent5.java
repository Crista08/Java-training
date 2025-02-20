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
public class ClassStudent5
{
    public static void main(String a[])
    {
        for(int i=1;i<=5;i++)
        {
        Student g1=new Student();
        Scanner in=new Scanner(System.in);
        System.out.print("Student name=");
        String name=in.nextLine();
        System.out.print("Student regno=");
        int reg_no=in.nextInt();
        System.out.println();
        System.out.println("The Name of the student "+i+" is:  "+name);
        System.out.println("The Regno of the student "+i+" is:  "+reg_no);
        System.out.println();
        }
    }
}