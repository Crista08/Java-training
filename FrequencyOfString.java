import java.util.Scanner;
class FrequencyOfString
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String  str=in.nextLine();
		String w[]=str.split(" ");
		int n=w.length;
		for(int i=0; i<n; i++)
		{
			if(w[i].equals(" ")) {
				continue;
			}
			int count=1;
			for(int j=i + 1; j<n; j++)
			{
				if(w[i].equals(w[j]))
				{
					count++;
					w[j]=" ";
				}
			}
			if (!w[i].equals(" ")) {
				System.out.println(w[i]+":"+count);
			}
		}
	}
}