package org.example;

public class Main {
    public static void main(String[] args) {
        // Gezegenleri listeleme
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println("Gezegen: " + gezegen);
            System.out.println("Sıralama Numarası: " + gezegen.getSiralamaNumarasi());
            System.out.println("Uzaklık (milyon km): " + gezegen.getUzaklik());
            System.out.println("Yarıçap (km): " + gezegen.getYaricap());
            System.out.println("Dönme Süresi (gün): " + gezegen.getDonmeSuresi());
            System.out.println("-------------------------------");
        }
    }
}