import java.util.Scanner;
class Rightangle
{
    public void Triangle()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n in rightangle triangle : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
class Left
{
    public void LeftTriangle()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n in lefttangle triangle : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
              System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }   
    }
}
class Patternclass
{
    public static void main(String args[]){
        Rightangle obj=new Rightangle();
        obj.Triangle();
        System.out.println();
        Left o=new Left();
        o.LeftTriangle();
    }
}