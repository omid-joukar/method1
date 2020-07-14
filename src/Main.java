import java.util.Scanner;

/**
 * Created by KPS on 7/14/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int num1 = scanner.nextInt();
        System.out.println("please enter a number");
        int num2 = scanner.nextInt();
        System.out.println("please enter a number");
        int num3 = scanner.nextInt();
        System.out.println("the smallest is :"+smallest(num1,num2,num3));
    }

    private static int smallest(int num1, int num2, int num3) {

            return Math.min(Math.min(num1, num2), num3);
        }
}
