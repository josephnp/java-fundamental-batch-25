package org.example;

import java.util.Date;
import java.util.Scanner;

public class Soal3{
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
}
