import java.util.Arrays;
class CombinationSum2
{
	public static void main(String args[])
	{
		int[] num= {10,1,2,7,6,1,5};
		int target=8;
		Arrays.sort(num);
		findCombinations(num,target,0,"");
	}
	public static void findCombinations(int[] num,int target,int index,String combination)
	{
	    if(target==0){
	        System.out.println(combination);
	    }
	    if(target<0)
	    {
	        return;
	    }
	    for(int i=index;i<num.length;i++){
	        if(i<index&&num[i]==num[i-1])continue;
	        findCombinations(num,target-num[i],i+1,combination+" "+num[i]);
	    }
	}
}