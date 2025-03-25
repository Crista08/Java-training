import java.util.Scanner;
class LCM{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.print("Enter the number1 : ");
int a=in.nextInt();
System.out.print("Enter the number2 : ");
int b=in.nextInt();
int lcm=findLCM(a,b);
System.out.print("The LCM of "+a+" and "+b+" is "+lcm);
}
public static int findLCM(int a,int b){
return a*b/findGcd(a,b);
}
public static int findGcd(int a,int b){
while(b!=0){
int temp=b;
b=a%b;
a=temp;
}
return a;
}
}

