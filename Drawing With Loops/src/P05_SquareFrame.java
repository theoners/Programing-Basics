import java.util.Scanner;

public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.print("+");

        for (int i = 0; i < n-2; i++) {
            System.out.print(" -");

        }
        System.out.println(" +");

        for (int i = 0; i < n-2; i++) {
            System.out.print("|");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" -");

            }
            System.out.println(" |");
            
        }
        System.out.print("+");

        for (int i = 0; i < n-2; i++) {
            System.out.print(" -");

        }
        System.out.println(" +");
    }
}
