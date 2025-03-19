class Divide2Integer
{
    public int divide(int dividend, int divisor)
    {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(dividend<0)^(divisor<0);
        long longDividend=Math.abs((long)dividend);
        long longDivisor=Math.abs((long)divisor);
        int q=0;
        while(longDividend>=longDivisor)
        {
            int shift=0;
            while((longDivisor<<shift)<=longDividend)
            {
                shift++;
            }
            q+=1<<(shift - 1);
            longDividend-=longDivisor<<(shift - 1);
        }
        return isNegative?-q:q;
    }
    public static void main(String[] args)
    {
        Divide2Integer obj=new Divide2Integer();
        System.out.println(obj.divide(10,3));  
         System.out.println(obj.divide(7,-3));
          System.out.println(obj.divide(4,-2));
    }
}