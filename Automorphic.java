import java.util.Scanner;
class Automorphic{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        int num=in.nextInt();
        int square=num*num;
        System.out.println("Enter the value of square : "+square);
        int digit=String.valueOf(num).length();
        int lastdigit=square%(int) Math.pow(10,digit);
        if(lastdigit==num){
            System.out.print("It is automorphic");
        }
        else{
            System.out.print("Its is not automorphic");
        }
    }
}