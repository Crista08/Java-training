import java.util.Scanner;
class Marksheet{
    public void get(){
        Scanner in=new Scanner(System.in);
        System.out.print(" Enter the Name of the student : ");
        String name=in.nextLine();
        System.out.print("Enter your Register number : ");
        int reg_no=in.nextInt();
        System.out.print("Enter the mark in Tamil : ");
        int s1=in.nextInt();
        System.out.print("Enter the mark in English : ");
        int s2=in.nextInt();
        System.out.print("Enter the mark in Maths : ");
        int s3=in.nextInt();
        System.out.print("Enter the mark in Physics : ");
        int s4=in.nextInt();
        System.out.print("Enter the mark in Chemistry : ");
        int s5=in.nextInt();
        System.out.print("Enter the mark in Computer Science : ");
        int s6=in.nextInt();
        int total=s1+s2+s3+s4+s5+s6;
        System.out.println("Total Marks : "+total);
        int avg=total/6;
        System.out.println("Average mark : "+avg);
        System.out.println();
        if(s1<50||s2<50||s3<50||s4<50||s5<50||s6<50){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
            if(total>=590&&total<=600){
                System.out.println("Grade : O ");
            }
            else if(total>=550&&total<=590){
                System.out.println("Grade : A ");
            }
            else if(total>=500&&total<=550){
                System.out.println("Grade : B ");
            }
            else if(total>=450&&total<=500){
                System.out.println("Grade : C ");
            }
            else if(total>=400&&total<=450){
                System.out.println("Grade : D ");
            }
            else if(total>=350&&total<=400){
                System.out.println("Grade : O ");
            }
            else{
                System.out.println("FAIL");
            }
        }
        }
    public static void main(String args[]){
        Marksheet a=new Marksheet();
        a.get();
    }
}