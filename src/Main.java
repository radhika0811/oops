import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sum;
        sum = 0;
        for(double i=1; i<=n; i++)
        {
            sum = sum + (1/i);
        }
        System.out.print(sum);
    }
}
