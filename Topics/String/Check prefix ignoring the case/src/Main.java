import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String strTrim = str.trim();
        System.out.println(strTrim.toUpperCase().startsWith("J"));
    }
}