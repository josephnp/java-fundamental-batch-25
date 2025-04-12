package org.example;

import java.util.*;

public class Main{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        if (x%2 == 0) {
//            System.out.println("Ini bilangan genap");
//        } else {
//            System.out.println("Ini bilangan ganjil");
//        }

//        String username = sc.nextLine();
//        String password = sc.nextLine();
//
//        if (username.equals("admin") && password.equals("admin")) {
//            System.out.println("Logged in");
//        } else {
//            System.out.println("Gagal");
//        }
//        sc.close();

        Soal1.soal1();
    }

    public static void soal1() {
        String nama = "Avengers: Endgame";
        int harga = 50000;
        int jumlah = 3;

        System.out.println("Nama Film: " + nama);
        System.out.println("Harga Tiket: " + harga);
        System.out.println("Jumlah Tiket: " + jumlah);
    }

    public static void soal2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String nama = sc.nextLine();

        System.out.println("Nama film dalam huruf besar: " + nama.toUpperCase());
        sc.close();
    }

    public static void soal3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah tiket: ");
        double jumlah = sc.nextDouble();

        /** Mengambil hari pada hari ini - Sabtu & Minggu dianggap weekend **/
        Date today = new Date();
        double total = (today.getDay() >= 1 && today.getDay() <= 5) ? jumlah * 35000 : jumlah * 45000;

        if (jumlah > 5) {
            total -= (total*0.1);
            System.out.println("Total harga (dengan diskon): " + (int)total);
        } else {
            System.out.println("Total harga: " + (int)total);
        }

        sc.close();
    }

    public static void soal4(){
        Scanner sc = new Scanner(System.in);
        String[] films = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama film " + i + ": ");
            films[i] = sc.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". " + films[i]);
        }
    }

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