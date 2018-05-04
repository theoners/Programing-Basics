import java.util.Scanner;

public class P05_Sequence2k1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int k = 1;

        for (int i = 0; k <= n; i++) {
            System.out.println(k);
            k = k *2+1;

        }
    }
}
