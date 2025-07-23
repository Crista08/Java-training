import java.util.Scanner;
class wPattern{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2-1;j++){
                if (j==0||j==n*2-2||(i>=n/2&&(j==2*i||j==n*2-2-2*i)))
                {
                    System.out.print("*"); 
                } 
                else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
                }
    }
}