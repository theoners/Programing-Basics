import java.util.Scanner;

public class P16_LiliBirthday {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double priceWashMashine= Double.parseDouble(console.nextLine());
        int priceToy = Integer.parseInt(console.nextLine());
        int moneyBirthday = 0;
        int toy = 0;
        int count = 0;


        for (int i = 1; i <=age; i++) {
            if (i%2==0){
                ++count;
                moneyBirthday=moneyBirthday+count*10;


            }
            else{
                toy++;
            }

        }
        int moneyToy = toy*priceToy;
        int allMoney = moneyToy+moneyBirthday - count;



        if (allMoney>=priceWashMashine){
            System.out.printf("Yes! %.2f", allMoney-priceWashMashine);
        }
        else{
            System.out.printf("No! %.2f", priceWashMashine-allMoney);
        }
    }
}
