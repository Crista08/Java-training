class RemoveElement
{
	public int removeElement(int[] num,int val)
	{
		int k=0;
		for(int i=0;i<num.length;i++)
		{
			if (num[i]!=val)
			{
				num[k++]=num[i];
			}
		}
		return k;
	}
	public static void main(String[] args)
	{
		RemoveElement obj=new RemoveElement();
		int[] num={3, 2, 2, 3};
		int val=3;
		int ans=obj.removeElement(num,val);
		System.out.println("Result: "+ans);
		for(int i=0; i<ans; i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}