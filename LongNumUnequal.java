class LongNumUnequal{
    public static void main(String args[]){
        StringBuilder num1=new StringBuilder("963852789");
        StringBuilder num2=new StringBuilder("7896523");
        int i=num1.length()-1;
        int j=num2.length()-1;
        int d1,d2,c=0,s,in;
        StringBuilder sum=new StringBuilder();
        while(i>=0 ||  j>=0 ||c>0){
            d1=(i>=0)? num1.charAt(i)-'0':0;
            d2=(j>=0)? num2.charAt(j)-'0':0;
            in=d1+d2+c;
            s=in%10;
            c=in/10;
            sum.append(s);
            i--;
            j--;
        }
        System.out.println(sum.reverse().toString());
    }
}