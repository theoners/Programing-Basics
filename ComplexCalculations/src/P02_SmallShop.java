import java.util.Scanner;

public class P02_SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine();
        String town = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        town = town.toLowerCase();
        product = product.toLowerCase();


        if (town.equals("sofia")){
            if (product.equals("coffee")){
                System.out.println(quantity*0.5);
            }
            else if (product.equals("water")){
                System.out.println(quantity*0.8);
            }
            else if (product.equals("beer")){
                System.out.println(quantity*1.2);
            }
            else  if (product.equals("sweets")){
                System.out.println(quantity*1.45);
            }
            else if (product.equals("peanuts")){
                System.out.println(quantity*1.60);
            }
        }
        if (town.equals("plovdiv")){
            if (product.equals("coffee")){
                System.out.println(quantity*0.4);
            }
            else if (product.equals("water")){
                System.out.println(quantity*0.7);
            }
            else if (product.equals("beer")){
                System.out.println(quantity*1.15);
            }
            else  if (product.equals("sweets")){
                System.out.println(quantity*1.30);
            }
            else if (product.equals("peanuts")){
                System.out.println(quantity*1.50);
            }
        }
        if (town.equals("varna")){
            if (product.equals("coffee")){
                System.out.println(quantity*0.45);
            }
            else if (product.equals("water")){
                System.out.println(quantity*0.7);
            }
            else if (product.equals("beer")){
                System.out.println(quantity*1.1);
            }
            else  if (product.equals("sweets")){
                System.out.println(quantity*1.35);
            }
            else if (product.equals("peanuts")){
                System.out.println(quantity*1.55);
            }
        }
    }
}
