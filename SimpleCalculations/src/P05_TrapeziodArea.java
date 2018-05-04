import java.util.Scanner;

public class P05_TrapeziodArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double result = (a+b)*h/2;

        System.out.println(result);
    }
}
