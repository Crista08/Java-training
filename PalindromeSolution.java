class PalindromeSolution
{
    public boolean isPalindrome(int x)
    {
        if (x<0) {
            return false;
        }
        int rev=0;
        int a=x;
        while (x>0) 
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return a==rev;
    }

    public static void main(String[] args) 
    {
        PalindromeSolution solution = new PalindromeSolution();
        System.out.println("The palindrome result for num1 is "+solution.isPalindrome(121));
        System.out.println("The palindrome result for num2 is "+solution.isPalindrome(-121));
        System.out.println("The palindrome result for num3 is "+solution.isPalindrome(10));
    }
}