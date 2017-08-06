import java.util.Scanner;
package Factorial;

public class CalculateFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Podaj liczbe: ");
        n = scanner.nextInt();
        System.out.println("Wartosc silni: " + calculateFactorial(n));
    }
    public static int calculateFactorial(int n) {
        if (n<=1) {
            return 1;

        } else {
            return n*calculateFactorial(n-1);
        }
    }
}
