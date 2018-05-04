import java.util.Scanner;

public class P21_ToyShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double puzzle = 2.60;
        double barby = 3;
        double beer = 4.1;
        double minion = 8.2;
        double camion = 2;

        double priceHoliday = Double.parseDouble(console.nextLine());
        double countPuzzle = Double.parseDouble(console.nextLine());
        double countBarby = Double.parseDouble(console.nextLine());
        double coountBeer = Double.parseDouble(console.nextLine());
        double countMinion = Double.parseDouble(console.nextLine());
        double countCamion = Double.parseDouble(console.nextLine());

        double price = countPuzzle*puzzle+countMinion*minion+countCamion*camion+coountBeer*beer+countBarby*barby;
        double allToy = coountBeer+countBarby+countCamion+countMinion+countPuzzle;
        if (allToy>=50){
            price = price-(price*0.25);
        }
        double naem = price*0.1;
        double win = price -naem;

        if (win>=priceHoliday){
            System.out.printf("Yes! %.2f lv left.", win - priceHoliday);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed." , priceHoliday-win);
        }
    }
}
