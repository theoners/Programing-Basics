import java.util.Scanner;

public class P08_OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            if (i % 2==0){
                leftSum+=currentNumber;
            }else {
                rightSum+=currentNumber;
            }


        }
        if (leftSum == rightSum) {
            System.out.printf("Yes sum = %d", leftSum);
        }else {
            System.out.printf("No diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
