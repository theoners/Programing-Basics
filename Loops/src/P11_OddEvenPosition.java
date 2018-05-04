import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.############");
        int n = Integer.parseInt(console.nextLine());
        double evenSum = 0;
        double oddSum = 0;
        double evenMin=10000000;
        double oddMin= 10000000;
        double evenMax=-10000000;
        double oddMax= -10000000;

        for (int i = 1; i <=n ; i++) {
            double currentNum = Double.parseDouble(console.nextLine());
            if (i % 2==0){
                evenSum+=currentNum;
                if (currentNum<evenMin){
                    evenMin= currentNum;

                }
                if (currentNum>evenMax){
                    evenMax= currentNum;
                }
            }
            else {
                oddSum+=currentNum;
                if (currentNum<oddMin){
                    oddMin=currentNum;
                }
                if (currentNum>oddMax){
                    oddMax= currentNum;
                }
            }

        }
        System.out.printf("OddSum = %s,", df.format(oddSum));
        if (oddMin ==10000000){
            System.out.print("OddMin=No,");
        }
        else {
            System.out.printf("OddMin=%s,",df.format(oddMin));
        }
        if (oddMax ==-10000000){
            System.out.print("OddMax=No,");
        }
        else {
            System.out.printf("OddMax=%s,",df.format(oddMax));
        }
        System.out.printf("EvenSum=%s,",df.format(evenSum));

        if (evenMin ==10000000){
            System.out.print("EvenMin=No,");
        }
        else {
            System.out.printf("EvenMin=%s,",df.format(evenMin));
        }
        if (evenMax ==-10000000){
            System.out.print("EvenMax=No,");
        }
        else {
            System.out.printf("EvenMax=%s",df.format(evenMax));
        }
    }
}
