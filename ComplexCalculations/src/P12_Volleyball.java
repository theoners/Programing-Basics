import java.util.Scanner;

public class P12_Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String leapOrNormal = console.nextLine();
        int holidays = Integer.parseInt(console.nextLine());
        int weekendsInVillage = Integer.parseInt(console.nextLine());

        int allWeekends = 48;
        double weekendsInSofia = allWeekends -weekendsInVillage;
        double playInSofia = weekendsInSofia *3.0/4;
        double PlayInSofiaHolidays = holidays *2.0/3;
        double allPlayInSofia = playInSofia + weekendsInVillage + PlayInSofiaHolidays;
        double plusPlay = 0;

        if (leapOrNormal.equals("leap")){
             plusPlay = allPlayInSofia*0.15;
        }
        double allPlay = allPlayInSofia +plusPlay;

        System.out.printf("%.0f", Math.floor(allPlay));

    }
}
