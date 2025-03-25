import java.util.Scanner;
class GCD {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a=in.nextInt();
		System.out.print("Enter the value of b : ");
		int b=in.nextInt();
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.print("The gcd of a and b is "+a);
	}
}

