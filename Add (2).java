import java.util.*;
class Add{
    public static void main(String args[]){
        int num=12345;
        int output=0;
        while(num>0){
            int val=num%10;
            output+=val;
            num=num/10;
        }
        System.out.println(output);
    }
}