import java.util.Scanner;

public class P04_DwarfPresents {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int dwarfNumber = Integer.parseInt(console.nextLine());
        double money = Double.parseDouble(console.nextLine());
        double pricePresents = 0;
        double moneyForPresents=0;

        for (int i = 0; i <dwarfNumber; i++) {
            String presents = console.nextLine();
            if (presents.equals("sand clock")){
                pricePresents=pricePresents+2.20;
            }else if (presents.equals("magnet")){
                pricePresents = pricePresents+1.50;
            }else if (presents.equals("cup")){
                pricePresents = pricePresents+5;
            }else {
                pricePresents=pricePresents+10;
            }




        }
        moneyForPresents = pricePresents;
        if (money>=moneyForPresents){
            System.out.printf("Santa Claus has %.2f more leva left!", money-moneyForPresents);
        }else {
            System.out.printf("Santa Claus will need %.2f more leva.",moneyForPresents-money);
        }

    }
}
