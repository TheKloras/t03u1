package com.company;

public class Main {

    public static void main(String[] args) {
        int kiekis = 10;
        int[] skaiciai = new int[kiekis];
        skaiciai = new int[]{10, -96, 45, 78, 45, 15, -95, -777, -5, 105};
        System.out.println("Skaičiai masyve:" + kiekis);
        for (int i=0;i<10;i++){
            System.out.println(skaiciai[i]);
        }
    }
}
