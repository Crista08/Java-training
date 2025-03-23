import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to print:");
        int n = scanner.nextInt();
        printPrimeNumbers(n);
    }
    public static void printPrimeNumbers(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            int i = 2;
            int flag = 0;
            while (i <= num / 2) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
                i++;
            }
            if (flag == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}