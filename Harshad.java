import java.util.Scanner;
class Harshad{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int num=in.nextInt();
        int rem=0,sum=0,n;
        n=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
            
        }
        if(n%sum==0){
            System.out.print(n+" is harshad number");
            
        }
        else{
            System.out.print(n+" is not a harshad number");
            
        }
    }
}