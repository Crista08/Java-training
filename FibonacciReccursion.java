import java.util.*;
class FibonacciReccursion{
    public static void main(String args[]){
        int num=5;
        for(int i=0;i<num;i++){
            System.out.println(fib(i)+"");
            
        }
    }
    public static int fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
}