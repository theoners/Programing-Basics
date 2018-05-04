import java.util.Scanner;

public class P17_ThreeBrothers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double first = Double.parseDouble(console.nextLine());
        double second = Double.parseDouble(console.nextLine());
        double third = Double.parseDouble(console.nextLine());
        double father = Double.parseDouble(console.nextLine());

        double time = 1/(1/first+1/second+1/third);
        double time1 = time +(time*0.15);
        System.out.printf("Cleaning time: %.2f%n", time1);

        double diference = father - time1;

        if (diference<0){
            diference = Math.abs(diference);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",Math.ceil(diference));
        }
        else {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(diference));
        }

    }
}
