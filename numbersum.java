public class numbersum
{
    public static void main(String[] args)
    {
        int x = 9;
        int n = 5;
        int sum = 0;
        int num = 0;

        for (int i = 1; i <= n; i++)
       
        {
            num = 0;
            for (int j = 0; j < i; j++) {
                num = num * 10 + x;
            }
            sum += num;
        }

        System.out.println("The sum is: " + sum);
    }
}