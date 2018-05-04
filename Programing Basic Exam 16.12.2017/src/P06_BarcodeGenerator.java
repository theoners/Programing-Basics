import java.util.Scanner;

public class P06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int begin = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());

        int digitOneBegin = begin % 10;
        begin = begin / 10;
        int digitOneEnd = end % 10;
        end = end / 10;

        int digitSecondBegin = begin % 10;
        begin = begin / 10;
        int digitsecondEnd = end % 10;
        end = end / 10;

        int digitThirdBegin = begin % 10;
        begin = begin / 10;
        int digitThirdEnd = end % 10;
        end = end / 10;

        for (int i = begin; i <= end; i++) {
            if (i % 2 == 1) {

                for (int j = digitThirdBegin; j <= digitThirdEnd; j++) {
                    if (j % 2 == 1) {
                        for (int k = digitSecondBegin; k <= digitsecondEnd; k++) {
                            if (k % 2 == 1) {
                                for (int l = digitOneBegin; l <= digitOneEnd; l++) {
                                    if (l % 2 == 1) {
                                        System.out.print(i);
                                        System.out.print(j);
                                        System.out.print(k);
                                        System.out.print(l);
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
