import java.util.Scanner;

public class P13_Fibonachi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        while (n<2){
            System.out.println(1);
            break;
        }


        int first = 1;//1 1 3 5
        int second = 1;//3


        while (n>1){
            n--;
            int next = second+first;
            first=second;
            second = next;
        }

            System.out.println(second);

    }
}
