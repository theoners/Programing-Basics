import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <n ; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");


            }
            System.out.print("*");
            for (int j = 0; j <i; j++) {
                System.out.print(" *");


            }
            System.out.println();
        }
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 1; j <n-i-1 ; j++) {
                System.out.print(" *");

            }
            System.out.println();
            
        }
    }
}
