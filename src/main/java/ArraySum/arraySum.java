
package ArraySum;
import java.util.Scanner;

import java.util.ArrayList;

public class arraySum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj elementy tablicy: ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList();
        for (int i = 0; i < array.size(); i++) {
            System.out.println("podaj element nr" + i);
            array.add(scanner.nextInt());
        }

        System.out.println("Wynik: " + getArraySum(array));
    }

    public static int getArraySum(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < 0 ; i++) {

            result += array.get(i);
        } return result;
    }
}