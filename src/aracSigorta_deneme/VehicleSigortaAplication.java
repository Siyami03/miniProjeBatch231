package aracSigorta_deneme;

import java.util.Scanner;

public class VehicleSigortaAplication {
    public static void main(String[] args) {

        Vehicle arac = new Vehicle();
        Scanner input = new Scanner(System.in);

        boolean isAgain;

        do {
            System.out.println("Tarife donem giriniz");
            System.out.println("1. Ocak 2024");
            System.out.println("2. Haziran 2024");
            int donem = input.nextInt();
            String donemBilgisi = donem == 1 ? "Ocak 2024" : "Haziran 2024";

            if (donem == 1 || donem == 2){
                System.out.println("Arac tipini giriniz");
                System.out.println("otomobil,kamyon,otobus,motosiklet");
                arac.type = input.next().toLowerCase();
                arac.pirimHesaplama(donem);

                if (arac.pirim > 0){
                    System.out.println("***********************************************");
                    System.out.println("====> ARAC SİGORTA PİRİM HESAPLAMA <====");
                    System.out.println("TARİFE DONEMİ        : " + donemBilgisi);
                    System.out.println("ARAC TİPİ            : " + arac.type);
                    System.out.println("PİRİM TUTARI         : " + arac.pirim + " TL");
                    System.out.println("*************************************************");
                    System.out.println("Yeni islem icin 1, cikis icin 0 yaziniz");
                    int yapilanSecim = input.nextInt();
                    isAgain = yapilanSecim == 1 ? true : false;


                } else {
                    System.out.println("Hesaplama yapılamadi, tekrar deneyiniz");
                    System.out.println("Yeni islem icin 1, cikis icin 0 yaziniz");
                    int yapilanSecim = input.nextInt();
                    isAgain = yapilanSecim == 1 ? true : false;
                }


            } else {
                System.out.println("Hatali giris yaptınız, tekrar giris yapınız");
                isAgain=true;

            }

        }while (isAgain);


    }


}

