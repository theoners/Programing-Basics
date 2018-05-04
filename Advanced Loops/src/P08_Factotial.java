import java.util.Scanner;

public class P08_Factotial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum = n;

        while(n>1){
            n--;
             sum = n*sum;

        }
        System.out.println(sum);
    }
}
