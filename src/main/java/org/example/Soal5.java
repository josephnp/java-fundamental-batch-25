package org.example;

import java.util.Scanner;

public class Soal5{
    public static void soal5(){
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[5];

        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Harga tiket film " + i + ": ");
            prices[i] = sc.nextInt();

            total += prices[i];
        }

        System.out.println("Total harga tiket: " + total);
    }
}
