import java.util.Scanner;

public class P19_DanceHall {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        double count = Double.parseDouble(console.nextLine());
        double dancer = Double.parseDouble(console.nextLine());
        double days = Double.parseDouble(console.nextLine());

        double oneDay = Math.ceil(((count/days)/count)*100);
        double oneDancer =(oneDay)/dancer;

        if (oneDay<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f",oneDancer);
            System.out.println("%.");
        }
        else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f", oneDancer);
            System.out.print("%");
            System.out.println(" steps to be learned per day.");
        }
    }
}
