package org.example;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal3{
    public static void soal3() {
        Scanner sc = new Scanner(System.in);

        /** Try catch untuk input bukan angka atau di bawah 0 (tidak valid) */
        double jumlah = -1;
        while (jumlah < 0) {
            try {
                System.out.print("Jumlah tiket: ");
                jumlah = sc.nextDouble();
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        }

        /** Mengambil hari pada hari ini - Sabtu & Minggu dianggap weekend **/
        Calendar today = Calendar.getInstance();
        double total = (today.get(Calendar.DAY_OF_WEEK) >= 1 && today.get(Calendar.DAY_OF_WEEK) <= 5) ? jumlah * 35000 : jumlah * 45000;

        if (jumlah > 5) {
            total -= (total*0.1);
            System.out.println("Total harga (dengan diskon): " + (int)total);
        } else {
            System.out.println("Total harga: " + (int)total);
        }

        sc.close();
    }
}
