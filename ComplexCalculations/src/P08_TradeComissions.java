import java.util.Scanner;

public class P08_TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine();
        double sales = Double.parseDouble(console.nextLine());
        town = town.toLowerCase();

        if (sales<0){
            System.out.println("error");
        }
        else if (!(town.equals("sofia") ||town.equals("varna") ||town.equals("plovdiv"))){
            System.out.println("error");
        }
        else if (town.equals("sofia")){
            if (sales>=0 && sales<=500){
                System.out.printf("%.2f", sales*0.05);
            }
            else if (sales<=1000){
                System.out.printf("%.2f", sales*0.07);
            }
            else if (sales<=10000){
                System.out.printf("%.2f", sales*0.08);
            }else if (sales>10000){
                System.out.printf("%.2f", sales*0.12);
            }
        }
        else if (town.equals("varna")){
            if (sales>=0 && sales<=500){
                System.out.printf("%.2f", sales*0.045);
            }
            else if (sales<=1000){
                System.out.printf("%.2f", sales*0.075);
            }
            else if (sales<=10000){
                System.out.printf("%.2f", sales*0.10);
            }else if (sales>10000){
                System.out.printf("%.2f", sales*0.13);
            }
        }
        else if (town.equals("plovdiv")){
            if (sales>=0 && sales<=500){
                System.out.printf("%.2f", sales*0.055);
            }
            else if (sales<=1000){
                System.out.printf("%.2f", sales*0.08);
            }
            else if (sales<=10000){
                System.out.printf("%.2f", sales*0.12);
            }else if (sales>10000){
                System.out.printf("%.2f", sales*0.145);
            }
        }
    }
}
