import java.util.Scanner;
public class PalindromeTriangle {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int n=in.nextInt();
		for (int i=1; i<=n; i++){
			for (int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}