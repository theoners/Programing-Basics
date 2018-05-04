import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int stars = 0;
        int stars1=-1;

        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (n % 2 == 0) {
                stars =stars+ 2;
                for (int j = 0; j <(n-stars)/2 ; j++) {
                    System.out.print("-");

                }
                for (int j = 0; j <stars; j++) {
                    System.out.print("*");

                }
                for (int j = 0; j <(n-stars)/2 ; j++) {
                    System.out.print("-");

                }
                System.out.println("");
            }else {
                stars1=stars1+2;
                for (int j = 0; j <(n-stars1)/2 ; j++) {
                    System.out.print("-");

                }
                for (int j = 0; j <stars1; j++) {
                    System.out.print("*");

                }
                for (int j = 0; j <(n-stars1)/2 ; j++) {
                    System.out.print("-");

                }
                System.out.println("");

            }


        }
        for (int i = 0; i <n/2 ; i++) {
            System.out.print("|");
            for (int j = 0; j <n-2 ; j++) {
                System.out.print("*");
                
            }
            System.out.println("|");
            
        }
    }
}
