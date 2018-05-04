import java.util.Scanner;

public class P04_SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i <n ; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            sum = sum +currentNumber;

        }
        System.out.println(sum);
    }
}
