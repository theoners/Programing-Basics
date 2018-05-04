import java.util.Scanner;

public class P04_TriangleofDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("$ ");

            }
            System.out.println("$");

        }
    }
}
