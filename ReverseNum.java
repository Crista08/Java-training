import java.util.Scanner;
class ReverseNum
{
	public static void main(String args[])
	{
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter num ");
	    int x=in.nextInt();
	    int x1=x;
	    int rem=0,sum=0;
	    while(x1>0)
	    {
	        rem=x1%10;
	        sum=sum*10+rem;
	        x1=x1/10;
	    }
	    System.out.println("The reversed number is : "+sum);
	}
}