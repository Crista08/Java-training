import java.util.Scanner;
class Binary
{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the value of temp : ");
    int temp=in.nextInt();
    int rem;
    String binary="";
    while(temp>0)
    {
      rem=temp%2;
      binary=rem+binary;
      temp=temp/2;
    }
    System.out.println(binary);
  }
}