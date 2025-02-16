import java.util.Scanner;
public class Xstar{
   public static void main(String []args){
      int i, j, k, my_input;
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      k=my_input*2-1;
      for( i=1;i<=k;i++){
         for( j=1;j<=k;j++){
            if(j==i || j==k-i+1)
               System.out.print("*");
               System.out.print(" ");
         }
         System.out.println();
       }
    }
}	