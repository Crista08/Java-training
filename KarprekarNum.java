import java.util.Scanner;
class KarprekarNum{
    public static boolean karprekar(int n){
       if(n==1)  return true;
       if(n<1) return false;
       long square=(long)n*n;
       String result=Long.toString(square);
       for(int i=1;i<result.length();i++){
        String left=result.substring(0,i);
        String right=result.substring(i);
        int leftnum=Integer.parseInt(left);
        int rightnum=Integer.parseInt(right);
        if(leftnum+rightnum==n)
        return true;}
        return false;
       }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(karprekar(n)){
            System.out.print("Karprekar");
        }
        else{
             System.out.print("Non Karprekar");
        }
      }
}