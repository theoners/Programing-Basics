import java.util.Scanner;

public class P14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        int min = Integer.parseInt(console.nextLine());

        if (min<45){
            min = min +15;
            System.out.println(hour+":"+min);
        }
        else if (hour!=23){
            hour = hour+1;
            min = min - 45;
            System.out.printf("%d:%02d",hour , min);
        }
        else {
            hour=0;
            min = min -45;
            System.out.printf("%d:%02d",hour , min);
        }
    }
}
