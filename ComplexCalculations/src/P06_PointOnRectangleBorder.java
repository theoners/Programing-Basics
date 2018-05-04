import java.util.Scanner;

public class P06_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if (x>x1 && x<x2 && y>y1 && y<y2 ){
            System.out.println("Inside / Outside");
        }
        else if (x<x1 || x>x2 || y<y1 || y>y2){
            System.out.println("Inside / Outside");
        }
        else {
            System.out.println("Border");
        }
    }
}
