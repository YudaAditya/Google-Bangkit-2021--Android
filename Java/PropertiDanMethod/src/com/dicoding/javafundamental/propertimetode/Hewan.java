package com.dicoding.javafundamental.propertimetode;

public class Hewan {
    double tinggi;
    double berat;
    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void makan() {
        System.out.println("Makan dengan mulut..");
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public int getUmur() {
        return umur;
    }
}
