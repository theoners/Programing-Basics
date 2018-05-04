import java.util.Scanner;

public class P13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();

        switch (figure) {
            case "square": {
                double a = Double.parseDouble(console.nextLine());
                System.out.printf("%.3f", a * a);
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(console.nextLine());
                double b = Double.parseDouble(console.nextLine());
                System.out.printf("%.3f", a * b);
                break;
            }
            case "circle":
                double r = Double.parseDouble(console.nextLine());
                System.out.printf("%.3f", Math.PI * r * r);
                break;
            default: {
                double a = Double.parseDouble(console.nextLine());
                double h = Double.parseDouble(console.nextLine());
                System.out.printf("%.3f", a * h / 2);
                break;
            }
        }
    }
}
