import java.util.Scanner;

public class P14_Birthday {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int h = Integer.parseInt(console.nextLine());
        double procent = Double.parseDouble(console.nextLine());

        double obem = (a*b*h*0.001)*(1-(procent/100));
        System.out.printf("%.3f", obem);



    }
}
