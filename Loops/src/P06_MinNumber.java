import java.util.Scanner;

public class P06_MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());

            if (currentNumber<minNumber){
                minNumber=currentNumber;
            }

        }
        System.out.println(minNumber);
    }
}
