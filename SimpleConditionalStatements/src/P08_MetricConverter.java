import java.util.Scanner;

public class P08_MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double distance = Double.parseDouble(console.nextLine());
        String inputUnit = console.nextLine();
        String outputUnit = console.nextLine();

        double millimeters = 1000;
        double centimeters = 100;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double feet = 3.2808399;
        double yards = 1.0936133;

        switch (inputUnit) {
            case "mm":
                distance = distance / millimeters;
                break;
            case "cm":
                distance = distance / centimeters;
                break;
            case "mi":
                distance = distance / miles;
                break;
            case "in":
                distance = distance / inches;
                break;
            case "km":
                distance = distance / kilometers;
                break;
            case "ft":
                distance = distance / feet;
                break;
            case "yd":
                distance = distance / yards;
                break;
        }

        switch (outputUnit) {
            case "mm":
                distance = distance * millimeters;
                break;
            case "cm":
                distance = distance * centimeters;
                break;
            case "mi":
                distance = distance * miles;
                break;
            case "in":
                distance = distance * inches;
                break;
            case "km":
                distance = distance * kilometers;
                break;
            case "ft":
                distance = distance * feet;
                break;
            case "yd":
                distance = distance * yards;
                break;
        }

        System.out.printf("%f %s", distance, outputUnit);

    }
}
