import java.util.Scanner;
package Fibonacci;

public class Fibonacci {

    prviate int fibonacci(int x){
        if (x <= 2){
            return 1;

        }else {
            return fibonacci(x - 2) + fibonacci(x -1 );
        }
    }
}

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj x: ");
    }
