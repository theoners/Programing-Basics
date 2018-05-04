import java.util.Scanner;

public class P12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double unit = Double.parseDouble(console.nextLine());
        String inputcurrancy = console.nextLine();
        String outcurrancy = console.nextLine();
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        switch (inputcurrancy) {
            case "USD":
                unit = unit * USD;

                break;
            case "EUR":
                unit = unit * EUR;

                break;
            case "GBP":
                unit = unit * GBP;
                break;
        }

        switch (outcurrancy) {
            case "USD":
                unit = unit / USD;

                break;
            case "EUR":
                unit = unit / EUR;

                break;
            case "GBP":
                unit = unit / GBP;

                break;
        }

        System.out.printf("%.02f %s" , unit , outcurrancy);
    }
}
