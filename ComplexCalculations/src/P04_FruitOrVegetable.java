import java.util.Scanner;

public class P04_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine();

        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry")
                || product.equals("lemon") || product.equals("grapes")){
            System.out.println("fruit");
        }
        else if (product.equals("tomato")|| product.equals("cucumber")|| product.equals("pepper")|| product.equals("carrot")){
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }
    }
}
