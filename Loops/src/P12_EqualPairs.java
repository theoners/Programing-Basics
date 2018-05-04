import java.util.Scanner;

public class P12_EqualPairs {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int minSum = 10000000;
        int maxSum = -10000000;


        for (int i = 0; i <n ; i++) {
            int currentNum = Integer.parseInt(console.nextLine());
            int currentNum1 = Integer.parseInt(console.nextLine());
            sum = currentNum+currentNum1;
            if (sum>maxSum){
                maxSum=sum;
            }
            if (sum<minSum){
                minSum= sum;
            }


            
        }
        if (maxSum==minSum){
            System.out.printf("Yes, value=%d",maxSum);
        }
        else {
            System.out.printf("No, maxdiff=%d", maxSum-minSum);
        }
    }
}
