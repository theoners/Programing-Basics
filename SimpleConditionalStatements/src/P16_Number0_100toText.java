import java.util.Scanner;

public class P16_Number0_100toText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if (number<0 || number>100){
            System.out.println("invalid number");
        }
        else if (number ==100){
            System.out.println("one hundred");
        }
        else if (number ==0){
            System.out.println("zero");
        }
        else if (number ==1 ){
            System.out.println("one");
        }
        else if (number ==2){
            System.out.println("two");
        }
        else if (number ==3){
            System.out.println("three");
        }
        else if (number ==4){
            System.out.println("four");
        }
        else if (number ==5){
            System.out.println("five");
        }
        else if (number ==6){
            System.out.println("six");
        }
        else if (number ==7){
            System.out.println("seven");
        }
        else if (number ==8){
            System.out.println("eight");
        }
        else if (number ==9){
            System.out.println("nine");
        }
        else if (number ==10){
            System.out.println("ten");
        }
        else if (number ==11){
            System.out.println("eleven");
        }
        else if (number ==12){
            System.out.println("twelve");
        }
        else if (number ==13){
            System.out.println("thirteen");
        }
        else if (number ==14){
            System.out.println("fourteen");
        }
        else if (number ==15){
            System.out.println("fifteen");
        }
        else if (number ==16){
            System.out.println("sixteen");
        }
        else if (number ==17){
            System.out.println("seventeen");
        }
        else if (number ==18){
            System.out.println("eighteen");
        }
        else if (number ==19){
            System.out.println("nineteen");
        }

        else{
              if (number/10==2){
                System.out.print("twenty");
            }
            else if (number/10 ==3){
                System.out.print("thirty");
            }
            else if (number/10 ==4){
                System.out.print("forty");
            }
            else if (number/10 ==5){
                System.out.print("fifty");
            }
            else if (number/10 ==6){
                System.out.print("sixty");
            }
            else if (number/10 ==7){
                System.out.print("seventy");
            }
            else if (number/10 ==8){
                System.out.print("eighty");
            }
            else if (number/10 ==9){
                System.out.print("ninety");
            }
            if (number%10 ==1 ){
                System.out.println(" one");
            }
            else if (number%10 ==2){
                System.out.println(" two");
            }
            else if (number%10 ==3){
                System.out.println(" three");
            }
            else if (number%10 ==4){
                System.out.println(" four");
            }
            else if (number%10 ==5){
                System.out.println(" five");
            }
            else if (number%10 ==6){
                System.out.println(" six");
            }
            else if (number%10 ==7){
                System.out.println(" seven");
            }
            else if (number%10 ==8){
                System.out.println(" eight");
            }
            else if (number%10==9){
                System.out.println(" nine");
            }



        }








    }
}
