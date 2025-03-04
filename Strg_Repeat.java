import java.util.Scanner;

public class Strg_Repeat
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String ip=in.nextLine();
		StringBuilder s=new StringBuilder();
		for (int i=0;i<ip.length();i++)
		{
			char cc=ip.charAt(i);
			if (Character.isDigit(cc))
			{
				int r=Character.getNumericValue(cc);
				for (int j=0;j<r-1;j++)
				{
					s.append(s.charAt(s.length()-1));
				}
			}
			else
			{
				s.append(cc);
			}
		}
		System.out.println("Output is "+s.toString());
	}
}
