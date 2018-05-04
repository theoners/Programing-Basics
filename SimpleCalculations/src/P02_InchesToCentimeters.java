import java.util.Scanner;

public class P02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());

        System.out.println(a*2.54);
    }
}
