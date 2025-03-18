import java.util.Arrays;
class BubbleSort
{
    static void bubble(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        int[] a={2,6,4,98,45};
        BubbleSort.bubble(a);
        System.out.print("The bubble sorted number is ");
        System.out.println(Arrays.toString(a));
    }
}