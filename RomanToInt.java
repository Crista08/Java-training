class RomanToInt
{
    public static int romanToInt(String s)
    {
		int a=0;
		int[] b= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbols= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int i=0;
		while(i<s.length()) {
			for(int j=0; j<symbols.length; j++)
			{
				if(s.startsWith(symbols[j],i))
				{
					a+=b[j];
					i+=symbols[j].length();
					break;
				}
			}
		}
			return a;
    }
    public static void main(String[] args)
    {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("CDXCIV"));
        System.out.println(romanToInt("IIXCDXC"));
        System.out.println(romanToInt("LVCMIV"));
    }
}
