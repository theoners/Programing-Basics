import java.util.Scanner;

public class P16_MagicNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int magicNumber = Integer.parseInt(console.nextLine());
        int number = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        for (int m = 1; m < 10; m++) {
                            for (int n = 1; n < 10; n++) {

                                number = i * j * k * l * m * n;
                                if (number == magicNumber) {
                                    System.out.print(i);
                                    System.out.print(j);
                                    System.out.print(k);
                                    System.out.print(l);
                                    System.out.print(m);
                                    System.out.print(n);
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
