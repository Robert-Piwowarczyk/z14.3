import java.util.Scanner;

public class SumAlgorytm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int x = 0; (x ^ 2) < 100; x++) {
            x = sc.nextInt();
            sum += x;
        }
        if (sum == sum % 2) {
            System.out.println("wyświetl " + sum);
        }
    }
}