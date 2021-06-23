import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xOne = scan.nextInt();
        int yOne = scan.nextInt();
        int xTwo = scan.nextInt();
        int yTwo = scan.nextInt();

        if (xOne == xTwo || yOne == yTwo || Math.abs(xOne - xTwo) == Math.abs(yOne - yTwo)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
