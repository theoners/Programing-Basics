import java.util.Scanner;

public class P13_Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        double smalerthan200 = 0;
        double from200to399 = 0;
        double from400to599 = 0;
        double from600to799 = 0;
        double biggerthan800 = 0;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number<200){
                smalerthan200=smalerthan200+1;
            }else if (number<400){
                from200to399=from200to399+1;
            }else if (number<600){
                from400to599=from400to599+1;
            }else if (number<800){
                from600to799=from600to799+1;
            }else {
                biggerthan800=biggerthan800+1;

            }



        }
        double p1 = smalerthan200/n*100;
        double p2 = from200to399/n*100;
        double p3 = from400to599/n*100;
        double p4 = from600to799/n*100;
        double p5 = biggerthan800/n*100;
        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");
        System.out.printf("%.2f", p4);
        System.out.println("%");
        System.out.printf("%.2f", p5);
        System.out.println("%");


    }
}
