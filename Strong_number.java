import java.util.Scanner;
class Strong_number
{
    static int n,r,fact=1,temp;
    static int sum=0;
    static void num()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n=in.nextInt();
        System.out.println("The Factorial value of each digits : ");
        temp=n;
        while(temp>0)
        {
            fact=1;
            r=temp%10;
             for(int i = 1; i <= r; ++i)
            {
                fact=fact*i;
            }
            System.out.println(fact);
            sum=sum+fact;
            temp=temp/10;
        }
        System.out.println();
        System.out.println("Sum of the factorial of "+n+" = "+sum);
        System.out.println();
        if(sum==n)
        {
          System.out.println(n+" is a Strong number");
        }
        else
        {
            System.out.println(n+" is not a Strong number");
        }
       
    }
    public static void main(String arg[])
    {
       num();
    }
}
