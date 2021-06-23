//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] array = new String[8];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            array[i] = scan.next();
        }

        for (int j = 7; j >= 0; j--) {
            System.out.println(array[j]);
        }

    }
}