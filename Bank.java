import java.util.Scanner;
class Bank{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to KVB!");
        System.out.println("Please insert your ATM card");
        System.out.println("YES!!");
        System.out.print("Please enter your atm pin number : ");
        int p=in.nextInt();
        int bal=20000;
        if(p==4567){
            System.out.print("select an option balance(0) , withdraw(1) , deposit(2) , pin change(3) , exit(4)");
            int o=in.nextInt();
        if(o==0){
            System.out.println("Balance : "+bal);
            System.out.println("Thank you Visit again!");
        }
        else if(o==1){
            System.out.print("Choose savings account(0),current account(1):");
            int ch=in.nextInt();
            if(ch==0){
                System.out.print("Enter the amount to withdraw : ");
                int wa=in.nextInt();
                int w=bal-wa;
                if(wa>bal){
                    System.out.print("Insufficient balance!");
                }
                else{
                    System.out.println(wa+" withdrawed!");
                    System.out.println("Your current balance is : "+w);
                }
            }
            else if(o==1){
                System.out.print("Enter the amount to withdraw : ");
                int wa=in.nextInt();
                int w=bal-wa;
                if(wa>bal){
                    System.out.print("Insufficient balance!");
                }
                else{
                    System.out.println(wa+" withdrawed!");
                    System.out.println("Your current balance is : "+w);
                }
            }
        }
        else if(o==2){
            System.out.print("Enter your amt to deposit : ");
            int de=in.nextInt();
            int dp=bal+de;
            System.out.println(de+" is deposited to your bank account!");
            System.out.println(dp+" is your current balance!");
        }
        else if(o==3){
            System.out.print("Enter your old pin to change to your pin : ");
            int old=in.nextInt();
            if(old==p){
                System.out.print("Enter your new pin to change your old pin : ");
                int nep=in.nextInt();
                System.out.println("Your new pin is "+nep);
            }
            else{
                System.out.println("Invalid old pin,Thank you!");
            }
        }
        else if(o==4)
        {
            System.out.println("<<<<Thank you!Visit again!>>>>");
        }
        }
        else{
            System.out.println("Invalid pin number!");
        }

        }
}