import java.util.Arrays;
class Thirdmax
{
    public static int getThird(int [][] a,int row,int col)
    {
        int total=row*col;
        int [] c=new int[total];
        int b=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                c[b++] = a[i][j];
            }
        }
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return c[total-3];
    }
    public static void main(String args[]){
        int [][] a={
            {5,4,7},
            {1,8,3}
        };
        System.out.println("The third Maximum number in the array = "+getThird(a,2,3));
    }
}