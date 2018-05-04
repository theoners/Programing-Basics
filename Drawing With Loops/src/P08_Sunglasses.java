import java.util.Scanner;

public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

            for (int j = 0; j < n*2; j++) {
                System.out.print("*");

            }
            for (int j = 0; j <n; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < n*2; j++) {
                System.out.print("*");


            }
        System.out.println("");
        for (int i = 0; i <n-2 ; i++) {
            System.out.print("*");
            for (int j = 0; j <n*2-2; j++) {
                System.out.print("/");

            }
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (i == (n-1) / 2 - 1){
                    System.out.print("|");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.print("*");
            for (int j = 0; j <n*2-2; j++) {
                System.out.print("/");

            }
            System.out.println("*");


        }
        for (int j = 0; j < n*2; j++) {
            System.out.print("*");

        }
        for (int j = 0; j <n; j++) {
            System.out.print(" ");

        }
        for (int j = 0; j < n*2; j++) {
            System.out.print("*");


        }
            

    }
}
