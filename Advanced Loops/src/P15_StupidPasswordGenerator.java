import java.util.Scanner;

public class P15_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        int x = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    char one = (char) k;
                    for (int m = 97; m < 97 + l; m++) {
                        char two = (char) m;
                        if (i > j) {
                            x = i;
                        } else {
                            x = j;
                        }for (int p = x + 1; p <= n; p++) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(one);
                            System.out.print(two);
                            System.out.print(p + " ");

                        }
                    }
                }
            }
        }
    }
}
