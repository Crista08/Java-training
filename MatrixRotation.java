import java.util.Arrays;
class MatrixRotation
{
    public static void main(String[] args)
    {
        int[][] m={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("The Original Matrix is :");
        dispMatrix(m);
        displayRotateClockwise(m);
        System.out.println("the Rotated Clockwise matrix is :");
        dispMatrix(m);
        showRotateCounterclockwise(m);
        System.out.println("the Rotated Counterclockwise matrix is :");
        dispMatrix(m);
    }
    public static void displayRotateClockwise(int[][] m)
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=m[i][l];
                m[i][l]=m[i][r];
                m[i][r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void showRotateCounterclockwise(int[][] m)
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r)
            {
                int temp=m[i][l];
                m[i][l]=m[i][r];
                m[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
    }
    public static void dispMatrix(int[][] m)
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}