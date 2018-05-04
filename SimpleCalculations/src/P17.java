import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        int persons= Integer.parseInt(console.nextLine());
        int cakes = Integer.parseInt(console.nextLine());
        int gofrets = Integer.parseInt(console.nextLine());
        int paincake = Integer.parseInt(console.nextLine());

        double priceCake = 45;
        double priceGofrets = 5.8;
        double pricePaincakes = 3.2;
        double income = ((cakes * priceCake) + (gofrets*priceGofrets) + (paincake * pricePaincakes)) * persons * days;
        double result = income-(income/8);
        System.out.printf("%.2f", result);





    }
}
