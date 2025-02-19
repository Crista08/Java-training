import java.util.Arrays;
import java.util.Scanner;
class Scannerexample
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
         System.out.println(Arrays.toString(a));
    }
}