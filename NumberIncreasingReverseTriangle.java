import java.util.Scanner;
public class NumberIncreasingReverseTriangle{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int n=in.nextInt();
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i; j++) {
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}