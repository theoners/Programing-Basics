import java.util.Scanner;

public class P17_SpecialNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int specialNumber = 0;

        for (int i = 1; i < 9; i++) {
            if (number % i == 0) {
                for (int j = 1; j < 10; j++) {
                    if (number % j == 0) {
                        for (int k = 1; k < 10; k++) {
                            if (number % k == 0) {
                                for (int m = 1; m < 10; m++) {
                                    if (number % m == 0) {

                                        System.out.print(i);
                                        System.out.print(j);
                                        System.out.print(k);
                                        System.out.print(m);
                                        System.out.print(" ");
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}
