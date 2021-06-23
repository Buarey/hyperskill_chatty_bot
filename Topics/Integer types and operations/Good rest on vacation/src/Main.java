import java.util.Scanner;

class Main {
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        int durationDays;
        int foodCostPerDay; 
        int flightCost; 
        int nightCost; 
        int sum;
        durationDays = scanner.nextInt();
        foodCostPerDay = scanner.nextInt();
        flightCost = scanner.nextInt();

        nightCost = scanner.nextInt();
        sum = durationDays * foodCostPerDay + flightCost * 2 + (durationDays - 1) * nightCost;
        
        System.out.print(sum);
        
    }
}
