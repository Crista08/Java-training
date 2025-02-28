import java.util.Scanner;
class Harshad_range{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the starting number  : ");
        int start=in.nextInt();
        System.out.print("Enter the ending number  : ");
        int end=in.nextInt();
        for(int num=start;num<=end;num++){
        int rem=0,sum=0;
        int n=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(n%sum==0){
            System.out.println(n+" is  a harshad number");
            
        }
        else{
            System.out.println(n+" is not a harshad number");
        }
        num=n;
    }
}
}