import java.util.Scanner;

public class P07_SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        int sum = a + b + c;

        if (sum < 60){
            System.out.printf("0:%02d", sum);
        }
        else if (sum <120 && sum >60){
            System.out.printf("1:%02d",sum-60);
        }
        else if (sum>120){
            System.out.printf("2:%02d",sum -120);
        }
        else if (sum==60){
            System.out.println("1:00");
        }
        else{
            System.out.println("2:00");
        }

    }
}
