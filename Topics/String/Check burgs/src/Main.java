import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       //boolean result = str.contains("burg");
        System.out.println(str.endsWith("burg"));
    }
}