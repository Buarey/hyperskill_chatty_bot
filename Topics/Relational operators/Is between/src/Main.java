import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean checkOne = a >= b && a <= c;
        boolean checkTwo = a <= b && a >= c;

        System.out.println(checkOne || checkTwo);
    }
}