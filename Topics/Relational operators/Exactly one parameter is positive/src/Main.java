import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean checkA = a > 0 && b <= 0 && c <= 0;
        boolean checkB = a <= 0 && b > 0 && c <= 0;
        boolean checkC = a <= 0 && b <= 0 && c > 0;

        boolean result = checkA || checkB || checkC;
        System.out.println(result);
    }
}