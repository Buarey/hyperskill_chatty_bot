import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int firstDigit = input / 100;
        int secondDigit = input % 100 / 10;
        int thirdDigit = input % 10;
        int reverseHundreds = thirdDigit * 100;
        int reverseTens = secondDigit * 10;
        int reverseOnes = firstDigit;

        int sum = reverseHundreds + reverseTens + reverseOnes;

        System.out.println(sum);
    }
}