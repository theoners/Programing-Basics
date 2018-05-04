import java.util.Scanner;

public class P03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());

        if (a % 2==0){
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }
}
