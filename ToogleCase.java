import java.util.*;
class ToogleCase{
    public static void main(String args[]){
        String s="StaR";
        String op="";
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                op+=Character.toLowerCase(c);
            }else{
                op+=Character.toUpperCase(c);
            }
        }
        System.out.print(op);
    }
}