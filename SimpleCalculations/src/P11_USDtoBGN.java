import java.util.Scanner;

    public class P11_USDtoBGN {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            double bgn = Double.parseDouble(console.nextLine());
            double usd = 1.79549;
            double result = bgn * usd;
            System.out.printf("%.2f", result);
        }
    }
