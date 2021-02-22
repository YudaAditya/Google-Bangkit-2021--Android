package com.dicoding.javafundamentar.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan sangat sederhana");
        System.out.print("Masukkan angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int antoherValue = scanner.nextInt();
        int result = value + antoherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
