import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strOne = scan.nextLine().replace(" ", "");
        String strTwo = scan.nextLine().replace(" ", "");

        System.out.println(strOne.equals(strTwo));

    }
}