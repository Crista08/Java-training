import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        if(Palindrome(n))
        {
            System.out.println("Yes, It's a Palidrome.");
        }
        else
        {
            System.out.println("No, It's not a Palidrome.");
        }
    }
           public static boolean Palindrome(int n)
        {
            int a=n;
            int b=0;
            while (n!=0)
            {
                int d=n%10;
                b=b*10+d ;
                n/=10;
            }
            return a==b;
        }
}
