import java.util.Scanner;
class Octal
{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the value of temp : ");
    int temp=in.nextInt();
    int rem;
    String octal="";
    while(temp>0)
    {
      rem=temp%8;
      octal=rem+octal;
      temp=temp/8;
    }
    System.out.println(octal);
  }
}