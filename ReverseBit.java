class ReverseBit {
    public int reverse(int x) {
        long r=0;
        int s=x<0?-1:1;
        x*=s;
        while(x>0)
        {
            r=r*10+x%10;
            x/=10;
        }
        r*=s;
        if(r<Integer.MIN_VALUE||r>Integer.MAX_VALUE){
            return 0;
        }
        return (int) r;
    }
    public static void main(String args[]){
        ReverseBit obj=new ReverseBit();
        System.out.println("The reversed number : "+obj.reverse(123));
        System.out.println("The reversed number : "+obj.reverse(-123));
        System.out.println("The reversed number : "+obj.reverse(120));
    }
}