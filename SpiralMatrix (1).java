import java.util.Scanner;
class SpiralMatrix
{
    public static void main(String args[])
    {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int top=0;
        int bot=a.length-1;
        int l=0;
        int r=a[0].length-1;
        while(top<=bot&&l<=r)
        {
            for(int i=l;i<=r;i++)
            {
            System.out.println(a[top][i]+" ");
            }
           top++;
          for(int j=top;j<=bot;j++)
          {
            System.out.println(a[j][r]+" ");
          }
          r--;
          if(top<=bot)
          {
            for(int k=r;k>=l;k--)
            {
                System.out.println(a[bot][k]+" ");
            }
            bot--;
          }
            if(l<=r)
            {
                for(int x=bot;x>=top;x--)
                {
                  System.out.println(a[x][l]+ " ");  
                }
                l++;
            }
        }
    }
   
}