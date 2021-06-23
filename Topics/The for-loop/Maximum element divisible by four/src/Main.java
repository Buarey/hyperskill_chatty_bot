import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;


        for (int i = 0; i < n; i++) {
            int nLines = scan.nextInt();
            if (nLines % 4 == 0 && nLines > max) {
                max = nLines;
            }
        }
        System.out.println(max);
    }
}