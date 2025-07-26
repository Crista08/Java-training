class NonVowelString{
    public static void main(String args[]){
        String s="hello world";
        String output="";
        for(char ch:s.toCharArray()){
        if("aeiouAEIOU".indexOf(ch)==-1) {
            output+=ch;
        }
    }
    System.out.println(output);
    }
}