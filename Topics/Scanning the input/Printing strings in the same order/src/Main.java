import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[4];
        for (int i = 0; i < 4; i++) {
            array[i] = scan.next();
        }

        for (int j = 0; j <= 3; j++) {
            System.out.println(array[j]);
        }

    }
}
