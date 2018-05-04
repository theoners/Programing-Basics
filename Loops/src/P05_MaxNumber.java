import java.util.Scanner;

public class P05_MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            if (currentNumber>maxNumber){
                maxNumber=currentNumber;
            }

        }
        System.out.println(maxNumber);
    }
}
