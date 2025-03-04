class SubstringFunction
{
    public static void main(String args[])
    {
        String s1="I am a student.";
        String s2=s1.substring(3);
        System.out.println("The substring string is : "+s2);
        StringBuilder s=new StringBuilder(s1);
        //System.out.println(s);
        String sbstr=s.substring(3);
        System.out.println("The substring of StringBuilder is : "+sbstr);
        StringBuffer a=new StringBuffer(s1);
        System.out.print("The substring of stringbuffer : "+s1.substring(3));
    }
}