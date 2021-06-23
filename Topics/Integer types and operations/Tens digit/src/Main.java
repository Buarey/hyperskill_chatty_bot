import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1000) {
            int tensDigit = n % 1000;
            System.out.println(tensDigit % 100 / 10);
        } else if (n <= 999 && n >= 100) {
            int tensDigit = n % 100 / 10;
            System.out.println(tensDigit);
        } else if (n >= 10 && n <= 99) {
            int tensDigit = n / 10;
            System.out.println(tensDigit);
        } else if (n <= 9) {
            System.out.println(0);
        }
    }
}
