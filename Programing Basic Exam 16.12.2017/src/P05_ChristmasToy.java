import java.util.Scanner;

public class P05_ChristmasToy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        for (int j = 0; j < (4 * n) / 2; j++) {
            System.out.print("-");

        }
        for (int k = 0; k < n; k++) {
            System.out.print("*");

        }
        for (int j = 0; j < (4 * n) / 2; j++) {
            System.out.print("-");

        }
        System.out.println("");
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <n*2-2-2*i ; j++) {
                System.out.print("-");

            } for (int k = 0; k <1+i ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <n+2+2*i ; j++) {
                System.out.print("&");

            }
            for (int k = 0; k <1+i ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <n*2-2-2*i ; j++) {
                System.out.print("-");

            }System.out.println("");
            
        }for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                System.out.print("-");

            } for (int k = 0; k <2 ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <3*n-2+2*i ; j++) {
                System.out.print("~");

            }
            for (int k = 0; k <2 ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <n-1-i ; j++) {
                System.out.print("-");

            }System.out.println("");


        }for (int j = 0; j <n/2; j++) {
            System.out.print("-");

        }
        System.out.print("*");
        for (int i = 0; i <4*n-2 ; i++) {
            System.out.print("|");
            
        }System.out.print("*");
        for (int j = 0; j <n/2; j++) {
            System.out.print("-");

        }
        System.out.println("");

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <n/2+i ; j++) {
                System.out.print("-");

            } for (int k = 0; k <2 ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <4*n-4-2*i ; j++) {
                System.out.print("~");

            }
            for (int k = 0; k <2 ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <n/2+i ; j++) {
                System.out.print("-");

            }System.out.println("");



        }for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <n+2*i ; j++) {
                System.out.print("-");

            } for (int k = 0; k <n/2-i ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <2*n-2*i ; j++) {
                System.out.print("&");

            }
            for (int k = 0; k <n/2-i ; k++) {
                System.out.print("*");

            }
            for (int j = 0; j <n+2*i ; j++) {
                System.out.print("-");

            }System.out.println("");

        }
        for (int j = 0; j < (4 * n) / 2; j++) {
            System.out.print("-");

        }
        for (int k = 0; k < n; k++) {
            System.out.print("*");

        }
        for (int j = 0; j < (4 * n) / 2; j++) {
            System.out.print("-");

        }
        System.out.println("");

        }


    }

