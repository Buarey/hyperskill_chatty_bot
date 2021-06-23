import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a <= 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}