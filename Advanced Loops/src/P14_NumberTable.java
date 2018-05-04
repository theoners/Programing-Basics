import java.util.Scanner;

public class P14_NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int current = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                current = i + j + 1;
                if (current > number) {
                    current = 2*number-i-j-1;

                }
                System.out.print(current + " ");
            }
            System.out.println("");
        }
    }
}
