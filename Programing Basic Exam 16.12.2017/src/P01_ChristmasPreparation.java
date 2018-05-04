import java.util.Scanner;

public class P01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double hartiq = Double.parseDouble(console.nextLine());
        double plat = Double.parseDouble(console.nextLine());
        double lepilo = Double.parseDouble(console.nextLine());
        double procent = Double.parseDouble(console.nextLine());

        double priceHartiq = 5.80;
        double pricePlat = 7.20;
        double priceLepilo = 1.20;

        double allprice = hartiq*priceHartiq+plat*pricePlat+lepilo*priceLepilo;
        double after = allprice - ((allprice*procent)/100);

        System.out.printf("%.3f", after);
    }
}
