import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();


        // if (k >= n * m || k % 2 == 1) {
        if (k <= m * n && (k % m == 0 || k % n == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
