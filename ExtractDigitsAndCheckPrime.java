import java.util.Scanner;

public class ExtractDigitsAndCheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Extracted digits:");
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                System.out.println(digit);

                boolean isPrime = checkPrime(digit);
                System.out.println("Is prime? " + isPrime);
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}