package Problems;

import java.util.Stack;

public class DecodeString {
	 public static String decodeString(String s) {
		// TODO Auto-generated method stub
	Stack<Integer> s1 = new Stack<>();
    Stack<String> s2 = new Stack<>();
    String cr = "";
    int num = 0;
    for (char ch : s.toCharArray()) {
        if (Character.isDigit(ch)) {
            num = num * 10 + (ch - '0');
        } else if (ch == '[') {
            s1.push(num);
            s2.push(cr);
            num = 0;
            cr = "";
        } else if (ch == ']') {
            int l3 = s1.pop();
            String prev = s2.pop();
            String temp = "";
            for (int i = 0; i < l3; i++) {
                temp += cr;
            }
            cr = prev + temp;
        } else {
            cr += ch;
        }
	}
    return cr;
	 }
    
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));   
        System.out.println(decodeString("3[a2[c]]"));
    }  
}