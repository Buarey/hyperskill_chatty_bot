import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sampleCount = scan.nextInt();
        int perfect = 0;
        int fix = 0;
        int reject = 0;

        for (int i = 0; i < sampleCount; i++) {
            int sampleValue = scan.nextInt();
            if (sampleValue == 0) {
                perfect += 1;
            } else if (sampleValue == 1) {
                fix += 1;
            } else if (sampleValue == -1) {
                reject += 1;
            }
        }
        System.out.println(perfect + " " + fix + " " + reject);
    }
}
