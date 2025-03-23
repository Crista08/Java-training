import java.util.Scanner;
public class PronicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if (isPronic(num)) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }
    }
    public static boolean isPronic(int num) {
        int i = 0;
        while (true) {
            i++;
            int pronic = i * (i + 1);
            if (pronic == num) {
                return true;
            } else if (pronic > num) {
                return false;
            }
        }
    }
}