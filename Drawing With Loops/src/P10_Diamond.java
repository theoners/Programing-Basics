import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < (n - 1) / 2 +1; i++) {


            for (int j = 0; j < (n - 1) / 2 -i; j++) {
                System.out.print("-");

            }
            if (n%2==0 && i==0){
                System.out.print("**");
                for (int j = 0; j < (n - 1) / 2 -i; j++) {
                    System.out.print("-");

                }


            }else {
                System.out.print("*");
                if (i==0){
                    for (int j = 0; j < (n - 1) / 2 -i; j++) {
                        System.out.print("-");

                    }
                }

                if (n%2==1){
                    for (int j = 2; j < i*2+2-1; j++) {
                        System.out.print("-");

                    }
                    if (i!=0){
                        System.out.print("*");
                        for (int j = 0; j < (n - 1) / 2 -i; j++) {
                            System.out.print("-");

                        }
                    }

                }else {
                    for (int j = 2; j < i * 2 + 2; j++) {
                        System.out.print("-");

                        }
                    if (i!=0){
                        System.out.print("*");
                        for (int j = 0; j < (n - 1) / 2 -i; j++) {
                            System.out.print("-");

                        }

                    }

                }


                }

            System.out.println("");
            }
        for (int i = 0; i < (n - 1) / 2 ; i++) {
            for (int j = 0; j <  i+1; j++) {
                System.out.print("-");


            }
            if (i==((n - 1) / 2)-1 && n%2==0){
                System.out.print("**");
            }
            else {
                System.out.print("*");
                for (int j = 1; j < n -(i*2+2)-1; j++) {
                    System.out.print("-");


                }
                if (i!=((n - 1) / 2)-1){
                    System.out.print("*");
                }

            }
            for (int j = 0; j <  i+1; j++) {
                System.out.print("-");


            }

            System.out.println("");


        }





    }
}
