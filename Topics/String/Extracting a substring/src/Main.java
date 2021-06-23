import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int start = scan.nextInt();
        int finish = scan.nextInt();

        System.out.println(str.substring(start, finish + 1));
    }
}
