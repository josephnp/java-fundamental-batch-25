package org.example;

import java.util.Scanner;

public class Soal2{
    public static void soal2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String nama = sc.nextLine();

        System.out.println("Nama film dalam huruf besar: " + nama.toUpperCase());
        sc.close();
    }
}