import java.util.Scanner;
class Greatest{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a=in.nextInt();
        System.out.print("Enter the value of B : ");
        int b=in.nextInt();
        System.out.print("Enter the value of C : ");
        int c=in.nextInt();
        System.out.print("Enter the value of D : ");
        int d=in.nextInt();
        if(a>b&&a>c&&a>d){
            System.out.print("A is the largest number!");
        }
        else if(a==b&&b>c&&b>d){
            System.out.print("A and B are equal and largest!");
        }
        else if(a==c&&a>b&&a>d){
            System.out.print("Both A and c are equal and largest!");
        }
        else if(a==d&&a>b&&a>c){
            System.out.print("A and D are equal and largest!");
        }
        else if(a==b&&a==c&&a>d){
            System.out.print("A and B and C are equal and largest!");
        }
        else if(a==b&&a==d&&a>c){
            System.out.print("A and B and D are equal and largest!");
        }
        else if(a==c&&a==d&&a>b){
            System.out.print("A and C and D are equal and largest!");
        }
        else if(b>a&&b>c&&b>d){
            System.out.print("B is the largest number!");
        }
        else if(b==c&&b>a&&b>d){
            System.out.print("Both B and C are equal and largest!");
        }
        else if(b==d&&b>a&&b>c){
            System.out.print("B and D are equal and largest!");
        }
        else if(b==c&&b==d&&b>a){
            System.out.print("B and C and D are equal and largest!");
        }
        else if(c>a&&c>b&&c>d){
            System.out.print("C is the largest number!");
        }
        else if(c==d&&c>a&&c>b){
            System.out.print("C and D are equal and largest!");
        }
        else if(d>a&&d>b&&d>c){
            System.out.print("D is the largest number!");
        }
        else{
            System.out.print("All the numbers are equal!");
        }
    }
}