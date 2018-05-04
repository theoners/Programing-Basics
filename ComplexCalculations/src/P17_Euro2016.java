import java.util.Scanner;

public class P17_Euro2016 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        double count = Double.parseDouble(console.nextLine());
        double less = 0;
        double priceVIP = 499.99;
        double priceNormal = 249.99;

        if (category.equals("VIP")){
            if (count<5){
                less = budget * 0.25;
                if (less - priceVIP*count<0){
                    double need = priceVIP*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceVIP*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }

            }
            else if (count<9){
                less = budget * 0.4;
                if (less - priceVIP*count<0){
                    double need = priceVIP*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceVIP*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
            else if (count<24){
                less = budget * 0.5;
                if (less - priceVIP*count<0){
                    double need = priceVIP*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceVIP*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
            else if (count<49){
                less = budget * 0.6;
                if (less - priceVIP*count<0){
                    double need = priceVIP*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceVIP*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }else if (count>49){
                less = budget * 0.75;
                if (less - priceVIP*count<0){
                    double need = priceVIP*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceVIP*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
        }else if (category.equals("Normal")){
            if (count<5){
                less = budget * 0.25;
                if (less - priceNormal*count<0){
                    double need = priceNormal*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceNormal*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }

            }
            else if (count<9){
                less = budget * 0.4;
                if (less - priceNormal*count<0){
                    double need = priceNormal*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceNormal*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
            else if (count<24){
                less = budget * 0.5;
                if (less - priceNormal*count<0){
                    double need = priceNormal*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceNormal*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
            else if (count<49){
                less = budget * 0.6;
                if (less - priceNormal*count<0){
                    double need = priceNormal*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceNormal*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }else if (count>49){
                less = budget * 0.75;
                if (less - priceNormal*count<0){
                    double need = priceNormal*count - less;
                    System.out.printf("Not enough money! You need %.2f leva.", need);
                }else {
                    double left = less - priceNormal*count;
                    System.out.printf("Yes! You have %.2f leva left.", left);
                }
            }
        }
    }
}
