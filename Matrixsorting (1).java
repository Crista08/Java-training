import java.util.Scanner;
import java.util.Arrays;
class Matrixsorting
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r=in.nextInt();
        System.out.print("Enter the number of column : ");
        int c=in.nextInt();
        int [][]matrix=new  int[r][c];
        System.out.print("Enter the number of elements in the matrix : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix [i][j]=in.nextInt();
            }
        }
        int [] sorting=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                sorting[k++]=matrix [i][j];
            }
        }
        Arrays.sort(sorting);
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix [i][j]=sorting[k++];
            }
        }
        System.out.println("The matrix is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix [i][j]+" ");
            }
            System.out.println();
        }
    }
}