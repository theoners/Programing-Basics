import java.util.Scanner;

public class P12_Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <n-2; i++) {
            if (i%2==0){
                for (int j = 0; j < n-2; j++) {
                    System.out.print("*");

                }
                System.out.print("\\ /");
                for (int j = 0; j < n-2; j++) {
                    System.out.print("*");

                }
                System.out.println("");
            }
            if (i%2==1){
                for (int j = 0; j < n-2; j++) {
                    System.out.print("-");

                }
                System.out.print("\\ /");
                for (int j = 0; j < n-2; j++) {
                    System.out.print("-");

                }
                System.out.println("");
            }

        }
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(" ");

        }
        System.out.println("@");
        for (int i = 0; i <n-2; i++) {
            if (i%2==0){
                for (int j = 0; j < n-2; j++) {
                    System.out.print("*");

                }
                System.out.print("/ \\");
                for (int j = 0; j < n-2; j++) {
                    System.out.print("*");

                }
                System.out.println("");
            }
            if (i%2==1){
                for (int j = 0; j < n-2; j++) {
                    System.out.print("-");

                }
                System.out.print("/ \\");
                for (int j = 0; j < n-2; j++) {
                    System.out.print("-");

                }
                System.out.println("");
            }

        }
    }
}
