import java.util.Scanner;
class AutomorphicRange{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of start num : ");
        int start=in.nextInt();
        System.out.print("Enter the value of end num : ");
        int end=in.nextInt();
        System.out.print("The automorphic number from "+start+" to"+end );
        for(int num=start;num<=end;num++)
        {
            int square=num*num;
            int digit=String.valueOf(num).length();
            int lastdigit=square%(int) Math.pow(10,digit);
            if(lastdigit==num){
                System.out.println(num);
            }
        }
    }
}
        