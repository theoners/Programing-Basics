import java.util.Scanner;

public class P15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        if (a==b && b==c){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
