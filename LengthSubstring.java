class LengthSubstring{
    public static int lengthOfSubstring(String s) {
        int n=s.length();
        int a=0;
        int[] b=new int[128];
        for(int j=0,i=0;j<n;j++)
        {
            i=Math.max(b[s.charAt(j)],i);
            a=Math.max(a,j-i+1);
            b[s.charAt(j)]=j+1;
        }
        return a;
    }
    public static void main(String args[])
    {
        System.out.println("The length of Substring :"+lengthOfSubstring("abcabcbb"));
        System.out.println("The length of Substring :"+lengthOfSubstring("bbbbb"));
        System.out.println("The length of Substring :"+lengthOfSubstring("pwwkew"));
    }
}