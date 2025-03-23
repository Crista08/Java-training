import java.util.Scanner;
public class LeftTopHalfTriangle{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int n=in.nextInt();
        int num=2*n-2;
        for (int i = n; i >0; i--) {
            for (int j = 0; j<n-i; j++) {
                System.out.print(" ");
            }
            num=num-2;
            for(int j=0;j<i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}