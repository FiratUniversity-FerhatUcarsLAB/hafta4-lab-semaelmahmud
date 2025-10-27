
/*
 * Ad Soyad: [Sema Elmahmud]
 * Ogrenci No: [250541618]
 * Tarih: 27.10.2025
 * Aciklama: Maas Hesaplama Sistemi
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_SAAT = 160;
        final int GUN_SAYISI = 22;
        final int GUNLUK_SAAT = 8;
        final int TOPLAM_SAAT = GUN_SAYISI * GUNLUK_SAAT;

        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");

        System.out.print("Calisan ad soyad: ");
        input.nextLine(); // satır atlama hatasına karşı
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaat = input.nextInt();

        double mesaiUcreti = (brutMaas / AYLIK_SAAT) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / TOPLAM_SAAT;
        double gunlukNetKazanc = netMaas / GUN_SAYISI;

        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas                 : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat)    : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR              : %.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)     : %.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("Gelir Vergisi (%.1f%%)     : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)     : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI            : %.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAS                  : %.2f TL%n", netMaas);
        System.out.println("====================================");

        System.out.printf("Kesinti Orani   : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %.2f TL%n", gunlukNetKazanc);

        input.close();
    }
}

====================================
MAAS BORDROSU
====================================
Calisan ad soyad: sema elmahmud

Aylik brut maas (TL): 35000
Haftalik calisma saati: 30
Mesai saati: 6
Calisan: 
GELIRLER:
Brut Maas                 : 35000.00 TL
Mesai Ucreti (6 saat)    : 1968.75 TL
------------------------
TOPLAM GELIR              : 36968.75 TL
KESINTILER:
SGK Kesintisi (14.0%)     : 5175.63 TL
Gelir Vergisi (15.0%)     : 5545.31 TL
Damga Vergisi (0.8%)     : 280.59 TL
------------------------
TOPLAM KESINTI            : 11001.53 TL
NET MAAS                  : 25967.22 TL
====================================
Kesinti Orani   : 29.8%
Saatlik Net Kazanc: 147.54 TL
Gunluk Net Kazanc : 1180.33 TL

=== Code Execution Successful ===
