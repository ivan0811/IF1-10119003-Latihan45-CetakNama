package com.ivanfaathirza.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menampilkan nama dari
 * jumlah yang telah di masukkan oleh user menggunakan
 * getter dan setter dengan berorientasi objek
 */

public class IF110119003Latihan45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        Printer printer1 = new Printer();
        System.out.println("=====Aplikasi Pencetakan Nama======");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak berapa kali ? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer1.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
