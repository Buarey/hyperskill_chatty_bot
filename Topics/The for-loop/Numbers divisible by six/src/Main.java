import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int line = scan.nextInt();
            if (line % 6 == 0) {
                sum += line;
            }
        }
        System.out.println(sum);
    }
}