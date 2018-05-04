import java.util.Scanner;

public class P01_PersonalTitles {
    public static void main(String[] args) {
        Scanner console  =new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();

        if (age<16){
            if (gender.equals("m")){
                System.out.println("Master");
            }
            else {
                System.out.println("Miss");
            }
        }
        else {
            if (gender.equals("m")){
                System.out.println("Mr.");
            }
            else {
                System.out.println("Ms.");
            }
        }
    }
}
