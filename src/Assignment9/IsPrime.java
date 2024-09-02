import java.util.Scanner;
public class IsPrime {
        public static boolean isPrime(int number) {

            if (number <= 1) {
                return false;
            }


            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to check if it is prime: ");
            int number = scanner.nextInt();


            boolean prime = isPrime(number);


            if (prime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

