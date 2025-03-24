import java.util.Scanner;
class EvenOrOdd{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        if(n%2==0){
            System.out.print(n+" is Even.");
        }else{
            System.out.print(n+" is Odd.");
        }
    }
}