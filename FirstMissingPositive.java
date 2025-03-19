class FirstMissingPositive
{
    public int missingFirstPos(int[] num)
    {
       int n=num.length;
        for(int i=0;i<n;i++)
        {
            while(num[i]>0&&num[i]<=n&&num[num[i]-1]!=num[i])
            {
                swap(num,i,num[i]-1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(num[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;
    }
    private void swap(int[] num,int i,int j)
    {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public static void main(String[] args)
    {
        FirstMissingPositive obj=new FirstMissingPositive();
        int[] num={7,8,9,11,12};
        int result=obj.missingFirstPos(num);
        System.out.println("Result: "+result);
    }
}  