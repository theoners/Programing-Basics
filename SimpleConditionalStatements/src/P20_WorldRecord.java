import java.util.Scanner;

public class P20_WorldRecord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double record = Double.parseDouble(console.nextLine());
        double distance = Double.parseDouble(console.nextLine());
        double time1meter = Double.parseDouble(console.nextLine());

        double Ivancho = distance*time1meter;
        double total= Math.floor(distance/15)*12.5;
        double total1 = Ivancho+total;

        if (total1<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total1);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", total1 -record);
        }
    }
}
