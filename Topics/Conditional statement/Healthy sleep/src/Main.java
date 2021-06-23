import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //minimum of sleep
        int b = scan.nextInt(); // max sleep
        int h = scan.nextInt(); // how many sleep

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else if (h >= a && h <= b) {
            System.out.println("Normal");
        }


    }
}
