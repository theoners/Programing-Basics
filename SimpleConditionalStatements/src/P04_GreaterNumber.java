import java.util.Scanner;

public class P04_GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());

        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
