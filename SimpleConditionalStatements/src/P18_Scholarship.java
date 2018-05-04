import java.util.Scanner;

public class P18_Scholarship {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double wage =Double.parseDouble(console.nextLine());
        double score =Double.parseDouble(console.nextLine());
        double wageMin =Double.parseDouble(console.nextLine());
        if (score<4.50 || score<5.5 && wage>wageMin){
            System.out.println("You cannot get a scholarship!");
        }else {
            if (score<5.5){
                double scholarship = wageMin*0.35;
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarship));
            }
            else if (wage>=wageMin){
                double scholarship = score * 25;
                System.out.printf("You get a scholarship for excellent results %.0f BGN" ,Math.floor(scholarship) );
            }
            if (score>=5.5 && wage<wageMin){
                double scholarship = wageMin*0.35;
                double scholarship1 = score *25;
                if (scholarship1>=scholarship){
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarship1));
                }else {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarship));
                }
            }
        }


    }
}
