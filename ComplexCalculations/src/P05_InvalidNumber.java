import java.util.Scanner;

public class P05_InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num =Integer.parseInt(console.nextLine());

        if (!((num>=100 && num<=200)|| num ==0)){
            System.out.println("invalid");
        }
    }
}
