import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigitFirstTime = scanner.nextInt();
        int secondDigitFirstTime = scanner.nextInt();
        int thirdDigitFirstTime = scanner.nextInt();

        int firstDigitSecondTime = scanner.nextInt();
        int secondDigitSecondTime = scanner.nextInt();
        int thirdDigitSecondTime = scanner.nextInt();

        int firstTimeConversion = (firstDigitFirstTime * 60 + secondDigitFirstTime) * 60 + thirdDigitFirstTime;
        int secondTimeConversion = (firstDigitSecondTime * 60 + secondDigitSecondTime) * 60 + thirdDigitSecondTime;

        System.out.println(secondTimeConversion - firstTimeConversion);
    }
}