import java.util.Scanner;

public class P13_Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count = 0;


            for (int j = 0; j <n+1 ; j++) {
                System.out.print(".");
                
            }
            for (int j = 0; j < n*2+1; j++) {
                System.out.print("_");
                
            }
        for (int j = 0; j <n+1 ; j++) {
            System.out.print(".");

        }
        System.out.println("");
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <n+1-i ; j++) {
                System.out.print(".");

            }
            System.out.print("//");

            for (int j = 0; j <(n*2+i*2)-3; j++) {
                System.out.print("_");
                count= count+2;


                
            }
            System.out.print("\\\\");
            for (int j = 0; j <n+1-i ; j++) {
                System.out.print(".");

            }
            System.out.println("");


                
            }
        System.out.print("//");
        for (int j = 0; j <n*2-3 ; j++) {
            System.out.print("_");


        }
        System.out.print("STOP!");
        for (int j = 0; j <n*2-3; j++) {
            System.out.print("_");


        }
        System.out.println("\\\\");
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <i-1 ; j++) {
                System.out.print(".");

            }
            System.out.print("\\\\");

            for (int j = 0; j <(n*4-1)-i*2+2; j++) {
                System.out.print("_");




            }
            System.out.print("//");
            for (int j = 0; j <i-1 ; j++) {
                System.out.print(".");

            }
            System.out.println("");



        }

            

            

    }
}
