import java.util.Scanner;
public class LeftAngleTriangle{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int n=in.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i)+1; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}