import java.util.Scanner;

public class P16_OperationWithNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        String operator = console.nextLine();
        double result = 0;

        if (operator.equals("+")){
            result = num1+num2;
            System.out.printf("%.0f + %.0f = %.0f ",num1 , num2 , result);
            if (result%2==0){
                System.out.println("- even");
            }else {
                System.out.println("- odd");
            }

        }else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.printf("%.0f - %.0f = %.0f ", num1, num2, result);
            if (result % 2 == 0) {
                System.out.println("- even");
            } else {
                System.out.println("- odd");
            }
        }
        else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.printf("%.0f * %.0f = %.0f ", num1, num2, result);
            if (result % 2 == 0) {
                System.out.println("- even");
            } else {
                System.out.println("- odd");
            }
        }
        else if (operator.equals("/")) {
            if (num2 ==0){
                System.out.printf("Cannot divide %.0f by zero", num1);
            }
            else {
                result = num1 / num2;
                System.out.printf("%.0f / %.0f = %.2f ", num1, num2, result);
            }
        }
        else if (operator.equals("%")) {
            if (num2 ==0){
                System.out.printf("Cannot divide %.0f by zero", num1);
            }else {
                result = num1 % num2;
                String procent = "%";
                System.out.printf("%.0f %s %.0f = %.0f ", num1, procent, num2, result);
            }
        }
    }
}
