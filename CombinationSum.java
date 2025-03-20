import java.util.Scanner;
class CombinationSum
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the combinations : ");
        String input=in.nextLine();
        String[] inputs=input.split(" ");
        int[] candidate=new int[inputs.length];
        for(int i=0;i<inputs.length;i++)
        {
            candidate[i]=Integer.parseInt(inputs[i]);
        }
        System.out.print("Enter the target value : ");
        int target=in.nextInt();
        comSum(candidate,target,0,"",0);
    }
    public static void comSum(int[] candidate,int target,int startIn,String com,int currSum)
    {
        if (currSum==target)
        {
            System.out.println(com.trim());
            return;
        }
        if (currSum>target||startIn==candidate.length)
        {
            return;
        }
        comSum(candidate,target,startIn,com+" "+candidate[startIn],currSum+candidate[startIn]);
        comSum(candidate,target,startIn+1,com,currSum);
    }
}