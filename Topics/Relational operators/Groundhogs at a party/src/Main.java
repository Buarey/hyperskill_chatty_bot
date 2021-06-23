import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean trueWeekend = a >= 15 && a <= 25 && isWeekend;
        boolean normalParty = a >= 10 && a <= 20 && !isWeekend;

        System.out.println(trueWeekend || normalParty);
    }
}