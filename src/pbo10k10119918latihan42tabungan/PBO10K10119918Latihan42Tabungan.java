/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan42tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan penarikan uang menggunakan 
 * enkapsulasi
 *
 */

public class PBO10K10119918Latihan42Tabungan {
    private static int saldoAwal, uangDiambil, saldoAkhir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        saldoAwal = scanner.nextInt();
        
        System.out.print("Jumlah uang yang diambil : ");
        uangDiambil = scanner.nextInt();
        
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        saldoAkhir = tabungan.ambilUang(uangDiambil);
        
        System.out.println("Saldo Anda Sekarang : " + saldoAkhir);
    }
    
}
