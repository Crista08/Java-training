import java.util.Scanner;
class ElectricBilll{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of unit : ");
        int u=in.nextInt();
        System.out.print("Enter the typr(Normal=0,Commercial=1) : ");
        int t=in.nextInt();
        int c;
        int d;
        if(t==0){
            if(u>0&&u<100){
                System.out.print("Free 0 rs!");
            }
            else if(u>100&&u<200){
                c=u*5;
                System.out.print("For "+u+" Rs."+c);
            }
            else if(u>200&&u<300){
                c=u*10;
                System.out.print("For "+u+" Rs."+c);
            }
            else if(u>300&&u<400){
                c=u*15;
                System.out.print("For "+u+" Rs."+c);
            }
            else if(u>400&&u<500){
                c=u*20;
                System.out.print("For "+u+" Rs."+c);
            }
            else if(u>500){
                c=u*25;
                System.out.print("For "+u+" Rs."+c);
            }
            else{
                System.out.print("Invalid");
            }
        }
        else if(t==1){
            if(u>0&&u<100){
                d=u*10;
                System.out.print("For "+u+" Rs."+d);
            }
            else if(u>100&&u<200){
                d=u*15;
                System.out.print("For "+u+" Rs."+d);
            }
            else if(u>200&&u<300){
                d=u*20;
                System.out.print("For "+u+" Rs."+d);
            }
            else if(u>300&&u<400){
                d=u*25;
                System.out.print("For "+u+" Rs."+d);
            }
            else if(u>400&&u<500){
                d=u*30;
                System.out.print("For "+u+" Rs."+d);
            }
            else if(u>500){
                d=u*35;
                System.out.print("For "+u+" Rs."+d);
            }
            else{
                System.out.print("Invalid");
            }
        }
        else{
            System.out.print("Invalid!!");
        }
    }
}