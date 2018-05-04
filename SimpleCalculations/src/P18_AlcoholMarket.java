import java.util.Scanner;

public class P18_AlcoholMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double priceWiskey = Double.parseDouble(console.nextLine());
        double beer = Double.parseDouble(console.nextLine());
        double vine = Double.parseDouble(console.nextLine());
        double rakia = Double.parseDouble(console.nextLine());
        double wiskey = Double.parseDouble(console.nextLine());

        double priceRakia = priceWiskey/2;
        double priceBeer = priceRakia -(priceRakia*0.8);
        double priceVine = priceRakia -(priceRakia*0.4);

        double result = beer*priceBeer + vine*priceVine + wiskey*priceWiskey + rakia*priceRakia;
        System.out.printf("%.2f", result);

    }
}
