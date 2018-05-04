import java.util.Scanner;

public class P11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int number = 0;
        try {number = Integer.parseInt(input);

        }catch (Exception a){
            System.out.println("Invalid number!");
        }

        while (number%2!=0){
            System.out.println("The number is not even.");
            number =Integer.parseInt(console.nextLine());
        }
        System.out.println("Even number entered:"+number);
    }
}
