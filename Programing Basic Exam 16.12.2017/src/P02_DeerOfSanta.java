import java.util.Scanner;

public class P02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double days = Double.parseDouble(console.nextLine());
        double food = Double.parseDouble(console.nextLine());
        double foodForFirst = Double.parseDouble(console.nextLine());
        double foodForSecond = Double.parseDouble(console.nextLine());
        double foodForThird = Double.parseDouble(console.nextLine());

        double foodForAll = (foodForFirst+foodForSecond+foodForThird)*days;

        if (food>=foodForAll){
            System.out.printf("%.0f kilos of food left.", Math.floor(food-foodForAll));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(foodForAll-food));;
        }
    }
}
