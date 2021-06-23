import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        double sum = 0;


        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        double result = sum / count;
        System.out.println(result);
    }
}