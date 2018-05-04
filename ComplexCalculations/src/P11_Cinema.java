import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String project = console.nextLine();
        double c = Double.parseDouble(console.nextLine());
        double r = Double.parseDouble(console.nextLine());
        double price = 0;

        switch (project) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            default:
                price = 5;
                break;
        }
        System.out.printf("%.2f leva", c * r* price);


    }
}
