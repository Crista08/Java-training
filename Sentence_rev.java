import java.util.Scanner;
class Sentence_rev
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String ip=in.nextLine();
        ip = ip.replaceAll("\\s+", " ").trim();
        String[] words=ip.split(" ");
        StringBuilder rev=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            rev.append(words[i]).append(" ");
        }
        System.out.println("The revesed sentence : "+rev.toString().trim());
    }
}



