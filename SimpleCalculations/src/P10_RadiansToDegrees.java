import java.util.Scanner;

public class P10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = rad * 180/Math.PI;
        System.out.println(Math.round(deg));
    }
}
