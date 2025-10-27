/*
 * Ad Soyad: [Sema Elmahmud]
 * Ogrenci No: [250541618]
 * Tarih: 27.10.2025
 * Aciklama: Ogrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        String durum = (gpa >= 2.50) ? "Basarili Ogrenci" : "Gelistirilebilir Ogrenci";
        System.out.printf("Durum: %s%n", durum);

        input.close();
    }
}

=== OGRENCI BILGI SISTEMI ===
Adinizi girin: sema
Soyadinizi girin: elmahmud
Ogrenci numaraniz: 250541618
Yasiniz: 18
GPA (0.00-4.00): 3.75
=== OGRENCI BILGI SISTEMI ===
Ad Soyad: sema elmahmud
Ogrenci No: 250541618
Yas: 18
GPA: 3.75
Durum: Basarili Ogrenci

=== Code Execution Successful ===
