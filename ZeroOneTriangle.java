import java.util.Scanner;
public class ZeroOneTriangle {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int n=in.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}