class RomanToInt
{
    public static int romanToInt(String s)
    {
      int a=0;
        int[] b={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0;i<symbols.length;i++)
        {
            while(s.indexOf(symbols[i])==0)
            {
                a+=b[i];
                s=s.substring(symbols[i].length());
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
    }
}