import java.util.Scanner;

public class P03_SantasHoliday {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
         double days = Double.parseDouble(console.nextLine());
         String room = console.nextLine();
         String award = console.nextLine();
         double price = 0;

         if (days<10){
             if (room.equals("room for one person")){
                 price = (days-1)*18;

             }else if (room.equals("apartment")){
                 price = (days-1)*25;
                 price = price -((price*30)/100);
             }else{
                 price = (days-1)*35;
                 price = price -((price*10)/100);
             }

         }else if (days<16){
             if (room.equals("room for one person")){
                 price = (days-1)*18;

             }else if (room.equals("apartment")){
                 price = (days-1)*25;
                 price = price -((price*35)/100);
             }else{
                 price = (days-1)*35;
                 price = price -((price*15)/100);
             }

         }else{
            if (room.equals("room for one person")){
                price = (days-1)*18;

            }else if (room.equals("apartment")){
                price = (days-1)*25;
                price = price -((price*50)/100);
            }else{
                price = (days-1)*35;
                price = price -((price*20)/100);
            }

        }if (award.equals("negative")){
             price = price-((price*10)/100);
        }else {
             price = price+((price*25)/100);
        }
        System.out.printf("%.2f",price);
    }
}
