package BubbleSort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        System.out.println("Podaj wielkosc tablicy:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Podaj kolejna liczbe:");
            arrayN[i] = scanner.nextInt();


        }// Bubble Sort
        doBubbleSort(arrayN);

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }
    }
    public static void doBubbleSort(int[] arrayN) {

        int n = arrayN.length;
        boolean check = true;
        while(check) {

            check = false;
            for (int i = n-1; i > 0;i--) {
                if (arrayN[i] < arrayN[i-1]){
                    int temp = arrayN[i];
                    arrayN[i] = arrayN[i-1];
                    arrayN[i-1] = temp;
                    check = true;

                }
            }


        }return arrayN;
    }
}
