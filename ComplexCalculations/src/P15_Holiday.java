import java.util.Scanner;

public class P15_Holiday {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        double outcome = 0;

        if (budget<=100){
            if (season.equals("summer")){
                outcome = budget * 0.30;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f ", outcome);
            }
            else {
                outcome = budget * 0.70;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f ", outcome);
            }
        }
        else if (budget<=1000){
            if (season.equals("summer")){
                outcome = budget *0.40;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f ", outcome);
            }
            else {
                outcome = budget * 0.80;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f ", outcome);
            }
        }else {
            outcome = budget* 0.90;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f ", outcome);


        }
    }
}
