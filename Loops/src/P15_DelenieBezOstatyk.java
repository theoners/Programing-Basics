import java.util.Scanner;

public class P15_DelenieBezOstatyk {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
       double count2=0;
       double count3=0;
       double count4=0;

        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number%2==0){
                 count2=count2+1;
                if (number%4==0){
                    count4=count4+1;
                }
            } if (number%3==0){
                 count3=count3+1;
            }


        }
        double p1= count2/n*100;
        double p2= count3/n*100;
        double p3= count4/n*100;
        System.out.printf("%.2f",p1);
        System.out.println("%");
        System.out.printf("%.2f",p2);
        System.out.println("%");
        System.out.printf("%.2f",p3);
        System.out.println("%");

    }

}
