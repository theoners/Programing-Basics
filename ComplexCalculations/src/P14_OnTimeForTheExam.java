import java.util.Scanner;

public class P14_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner console  =new Scanner(System.in);

        int examHour = Integer.parseInt(console.nextLine());
        int examMinute = Integer.parseInt(console.nextLine());
        int arriveHour = Integer.parseInt(console.nextLine());
        int arriveMinute = Integer.parseInt(console.nextLine());
        int totalTimeExam = examHour * 60 + examMinute;
        int totalTimeArrive = arriveHour * 60 +arriveMinute;
        int difference = totalTimeArrive-totalTimeExam;
        difference = Math.abs(difference);

        if (totalTimeExam<totalTimeArrive){
            System.out.println("Late");

            if ((totalTimeArrive-totalTimeExam)<60){

                System.out.printf("%d minutes after the start", difference);
            }
            else {
                int hours =difference/60;
                int min = difference%60;
                System.out.printf("%d:%02d hours after the start", hours , min);

            }
        }else if (totalTimeArrive<=totalTimeExam && (totalTimeExam-totalTimeArrive)<=30) {

            System.out.println("On time");

              if (difference !=0) {
            System.out.printf("%d minutes before the start", difference);
        }
        }
        else if (totalTimeArrive<totalTimeExam && (totalTimeExam-totalTimeArrive)>30){
            System.out.println("Early");
            if (difference<60){
                System.out.printf("%d minutes before the start", difference);
            }else {
                int hours =difference/60;
                int min = difference%60;
                System.out.printf("%d:%02d hours before the start", hours , min);
            }

        }
    }
}
