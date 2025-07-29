import java.util.*;
class AnagramString{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s2=in.nextLine();
        if(s.length()!=s2.length()){
            System.out.println("Given strings are not anagram");
            return;
        }
        int[] count=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++; 
            count[s2.charAt(i) - 'a']--; 
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                System.out.println("The given string is not  anagram");
                return;
            }
        }
                System.out.println("The given string is anagram");
    }
}