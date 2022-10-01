import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            System.out.println(num + checkIsPrime(num));
        }
    }

    private static String checkIsPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return " is not Prime.";
            }
        }

        return " is prime.";
    }
}
