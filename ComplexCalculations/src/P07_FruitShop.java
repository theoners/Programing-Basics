import java.util.Scanner;

public class P07_FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine();
        String day = console.nextLine();
       double quantity =Double.parseDouble(console.nextLine());

        if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")
                ||day.equals("Friday")){
            switch (fruit) {
                case "banana":
                    System.out.println(quantity * 2.5);
                    break;
                case "apple":
                    System.out.println(quantity * 1.2);
                    break;
                case "orange":
                    System.out.println(quantity * 0.85);
                    break;
                case "grapefruit":
                    System.out.println(quantity * 1.45);
                    break;
                case "kiwi":
                    System.out.println(quantity * 2.70);
                    break;
                case "pineapple":
                    System.out.println(quantity * 5.50);
                    break;
                case "grapes":
                    System.out.println(quantity * 3.85);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }
         if (day.equals("Saturday")|| day.equals("Sunday")){
             switch (fruit) {
                 case "banana":
                     System.out.println(quantity * 2.70);
                     break;
                 case "apple":
                     System.out.println(quantity * 1.25);
                     break;
                 case "orange":
                     System.out.println(quantity * 0.90);
                     break;
                 case "grapefruit":
                     System.out.println(quantity * 1.60);
                     break;
                 case "kiwi":
                     System.out.println(quantity * 3);
                     break;
                 case "pineapple":
                     System.out.println(quantity * 5.60);
                     break;
                 case "grapes":
                     System.out.println(quantity * 4.20);
                     break;
                 default:
                     System.out.println("error");
                     break;
             }

         }
         else {
             System.out.println("error");
         }

    }
}
