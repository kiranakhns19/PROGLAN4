package com.modul;

import java.util.Scanner;

public class CodeTemplate {
    public static String kalimat, cari;

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        inputan1(a);
        inputan2(a);
        int i = 0;
        while(i<kalimat.length()){
            String apa = kalimat.substring(i, i+1);
            if(apa.contains(cari)){
                System.out.println("Ada di index ke : " + i + " ");
            }
            i++;
        }
    }

    public static void inputan2(Scanner a) {
        System.out.println("Masukkan huruf yang dicari : ");
        cari = a.next();
    }

    public static void inputan1(Scanner a) {
        System.out.println("Input kalimat : ");
        kalimat = a.nextLine();
    }
}
