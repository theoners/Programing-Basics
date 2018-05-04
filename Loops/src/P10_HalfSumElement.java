import java.util.Scanner;

public class P10_HalfSumElement {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            sum +=currentNumber;
            if (currentNumber>maxNumber){
                maxNumber= currentNumber;
            }

        }
        if (sum -maxNumber ==maxNumber){
            System.out.printf("Yes Sum = %d", maxNumber);
        }
        else {
            System.out.printf("No Diff = %d", Math.abs(sum-maxNumber*2));
        }
    }
}
