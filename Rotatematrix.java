import java.util.Scanner;
public class Rotatematrix
{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int x=a.length;
        int y=a[0].length;
        System.out.println("no. of rows :"+x);
        System.out.println("no. of rows :"+y);
        System.out.println();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
               
            }
            System.out.println();
        }
        System.out.println();
       
        int row=0;
        int col=0;
        int cur=0;
        int prev=0;
        while(row<x && col<y)
        {
            if(row+1==x || col+1==y)
            {
                break;
            }
            prev=a[row+1][col];
            for(int i=col;i<y;i++)
            {
                cur=a[row][i];
                a[row][i]=prev;
                prev=cur;
                a[row+1][col]=prev;
            }
            row++ ;
            for(int i=row;i<x;i++)
            {
                cur=a[i][y-1];
                a[i][y-1]=prev;
                prev=cur;
                a[row][col]=prev;
            }

            row++;
            col++;
            for(int i=col;i<y-1;i++)
            {
                cur=a[row][i];
                a[row][i]=prev;
                prev=cur;
                a[row-1][col-1]=prev;
            }

            int m=0;
            cur=a[row][m];
            a[row][m]=prev;
            a[row-1][m]=cur;
           
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
               
            }
            System.out.println();
        }
    }
}