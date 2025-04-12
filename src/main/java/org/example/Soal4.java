package org.example;

import java.util.Scanner;

public class Soal4{
    public static void soal4(){
        Scanner sc = new Scanner(System.in);
        String[] films = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            films[i] = sc.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + films[i]);
        }
    }
}
