/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo;

import java.util.Scanner;
/**
 *
 * @author dhezun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Deklarasi Var
        String nama,nim;
        int usia;
        double nilaiUts,nilaiUas;
//input nama, nim, usia, nilai UTS, nilai UAS
        System.out.println("==========================");
        System.out.println("       INPUT DATA         ");
        System.out.println("==========================");
        System.out.print("Nama         : "); 
        nama = input.nextLine();
        System.out.print("Nim          : "); 
        nim = input.nextLine();
        System.out.print("Usia         : "); 
        usia = input.nextInt();
        System.out.print("Nilai Uts    : "); 
        nilaiUts = input.nextDouble();
        System.out.print("Nilai Uas    : "); 
        nilaiUas = input.nextDouble();
//menampung data yang telah di input ke dalam class Mahasiswa    
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, usia, nilaiUts, nilaiUas);
//Menu
        int pilih;
        do {
            System.out.println("==========================");
            System.out.println("           OPSI           ");
            System.out.println("==========================");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
            switch(pilih){
            case 1:
                System.out.println("==========================");
                System.out.println("      TAMPIL DATA         ");
                System.out.println("==========================");
                System.out.println("Perkenalkan nama saya " + mahasiswa.nama);
                System.out.println("Nim         : " + mahasiswa.nim);
                System.out.println("Usia        : " + mahasiswa.usia);
                System.out.println("Nilai Akhir : " + mahasiswa.nilaiAkhir());
                break;
            case 2:
                System.out.println("==========================");
                System.out.println("       INPUT DATA         ");
                System.out.println("==========================");
                input = new Scanner(System.in);
                System.out.print("Nama         : "); 
                mahasiswa.nama = input.nextLine();
                System.out.print("Nim          : "); 
                mahasiswa.nim = input.nextLine();
                System.out.print("Usia         : "); 
                mahasiswa.usia = input.nextInt();
                System.out.print("Nilai Uts    : "); 
                mahasiswa.nilaiUts = input.nextDouble();
                System.out.print("Nilai Uas    : "); 
                mahasiswa.nilaiUas = input.nextDouble();
                break;
            case 3:
                System.exit(0);
            }
           } while(pilih!=3);
    }
}
