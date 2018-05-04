import java.util.Scanner;

public class P15_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = Integer.parseInt(console.nextLine());
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double USD = 1.85;

        double area = count * (a + 2 * 0.30)*(b + 2 * 0.30);
        double area2 = count *(a/2) *(a/2);
        double priceUSD = area * 7 +area2 * 9;
        double priceBGN = priceUSD * 1.85;
        System.out.printf("%.2f USD %n", priceUSD);
        System.out.printf("%.2f BGN", priceBGN);



    }
}
