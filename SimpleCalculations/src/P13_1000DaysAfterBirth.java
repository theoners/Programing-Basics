import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String birthDay = console.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate after1000d = LocalDate.parse(birthDay, dateTimeFormatter).plusDays(999);

        System.out.println(dateTimeFormatter.format(after1000d));
    }
}
