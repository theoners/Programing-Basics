import java.util.Scanner;

public class P04_ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String FirstName = console.nextLine();
        String LastName = console.nextLine();
        int Years = Integer.parseInt(console.nextLine());
        String Town = console.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", FirstName, LastName,Years,Town);
    }
}
