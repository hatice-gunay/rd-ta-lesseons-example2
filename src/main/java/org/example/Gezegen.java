package org.example;

public enum Gezegen {
    MERKÜR(1, 10.1, 1000.7, 5.0),
    VENüS(2, 90.2, 5000.8, 100.0),
    EARTH(3, 110.2, 5000.0, 5.0),
    MARS(4, 150.9, 3000.5, 5.0),
    JÜPİTER(5, 300.5, 10000.0, 0.7),
    SATÜRN(6, 1200.4, 55555.0, 0.4),
    URANÜS(7, 122.5, 25000.0, 3.7),
    NEPTÜNE(8, 2000.1, 20000.0, 0.3);

    private int siralamaNumarasi;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;


    Gezegen(int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }


    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}