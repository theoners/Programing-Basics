import java.util.Scanner;

public class P09_SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int sum = 0;

        while (number > 0) {
            int digits = number %10;
            sum = sum +digits;
            number = number/10;
        }
        System.out.println(sum);
    }
}
