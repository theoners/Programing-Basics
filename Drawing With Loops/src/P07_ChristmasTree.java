import java.util.Scanner;

public class P07_ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");

                
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");

            }
            
            System.out.print(" | ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }

            System.out.println("");

            
        }
    }
}
