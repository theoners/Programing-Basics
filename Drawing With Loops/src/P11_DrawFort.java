import java.util.Scanner;

public class P11_DrawFort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");

        }
        System.out.print("\\");
        for (int i = 0; i < (n*2-4)-(n/2)*2; i++) {
            System.out.print("_");

        }
        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");

        }
        System.out.println("\\");
        
        for (int i = 0; i <n-3 ; i++) {
            System.out.print("|");
            for (int j = 0; j <n*2-2 ; j++) {
                System.out.print(" ");
                
            }
            System.out.println("|");
            
            
        }
        for (int i = 0; i < 1; i++) {
            System.out.print("|");
            for (int j = 0; j <n/2+1 ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <(n*2-4)-(n/2)*2 ; j++) {
                System.out.print("_");

            }
            for (int j = 0; j <n/2+1 ; j++) {
                System.out.print(" ");

            }
            System.out.println("|");

        }
        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");

        }
        System.out.print("/");
        for (int i = 0; i < (n*2-4)-(n/2)*2; i++) {
            System.out.print(" ");

        }
        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");

        }
        System.out.println("/");



    }
}
