package aracSigorta_deneme;

import java.util.Scanner;
public class Vehicle {

    public String type;
    public int pirim;

    public void pirimHesaplama(int donem){
        switch (type){
            case "otomobil":
                pirim = donem == 1 ? 2000 : 2500;
                break;
            case "kamyon":
                pirim = donem == 1 ? 3000 : 3500;
                break;
            case "otobus":
                pirimHesaplamaOtobus(donem);
                break;
            case "motosiklet":
                pirim = donem == 1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatali giris");
                pirim = 0;
        }

    }

    public void pirimHesaplamaOtobus(int donem){
        Scanner input = new Scanner(System.in);
        System.out.println("Otobus tipini seciniz");
        System.out.println("1. 18 - 30 arasi koltuk sayisi");
        System.out.println("2. 30 ustu koltuk sayisi");
        int otobusTipi = input.nextInt();

        switch (otobusTipi){
            case 1:
                pirim = donem == 1 ? 4000 : 4500;
                break;
            case 2:
                pirim = donem == 1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatali giris");
                pirim = 0;

        }


    }



}
