import java.util.Scanner;

public class P12_NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int curent = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (curent>=number){
                    break;
                }
                 curent =curent+1;
                System.out.print(curent+" ");


            }


            System.out.println("");

        }
    }
}
