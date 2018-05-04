import java.util.Scanner;

public class P10_CheckPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        String num = "Prime";
        if (number < 2) {
            System.out.println("Not Prime");

        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                while (number % i == 0) {
                    num = "Not prime";
                    break;
                }


            }
            System.out.println(num);
        }

    }
}
