import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < 4; j++) {
            System.out.print(--array[j] + " ");
        }

    }
}
