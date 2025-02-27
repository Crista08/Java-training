import java.util.Scanner;
class Hexadecimal
{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the value of temp : ");
    int temp=in.nextInt();
    int rem;
    String hexadecimal="";
    while(temp>0)
    {
      rem=temp%16;
      hexadecimal=rem+hexadecimal;
      temp=temp/16;
    }
    System.out.println(hexadecimal);
  }
}