package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal5{
    public static void soal5(){
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[5];
        Arrays.fill(prices, -1);

        int total = 0;
        for (int i = 0; i < 5; i++) {
            /** Try catch untuk input bukan angka atau di bawah 0 (tidak valid) */
            while (prices[i] < 0) {
                try {
                    System.out.print("Harga tiket film "+(i+1)+": ");
                    prices[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.nextLine();
                }
            }

            total += prices[i];
        }

        System.out.println("Total harga tiket: " + total);
    }
}
