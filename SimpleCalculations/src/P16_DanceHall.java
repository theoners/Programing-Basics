import java.util.Scanner;

public class P16_DanceHall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double l = Double.parseDouble(console.nextLine());
        double w = Double.parseDouble(console.nextLine());
        double a = Double.parseDouble(console.nextLine());

        double hall = l*w*10000;
        double one = a*a*10000;
        double two = hall/10;
        double freeSpace = hall-one-two;
        double countPersons = Math.floor(freeSpace/7040);
        System.out.printf("%.0f", countPersons);


    }
}
