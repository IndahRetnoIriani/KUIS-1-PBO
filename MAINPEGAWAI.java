/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA: INDAH RETNO IRIANI
 */
import java.util.Scanner;
public class MAINPEGAWAI {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        PEGAWAI krj = new PEGAWAI();
        
        System.out.println("=================================================");
        System.out.println("Berapa data yang akan Anda Masukkan?");
        int jml = input.nextInt();
        for(int i=1; i<=jml; i++){
        System.out.println("=================================================");
        System.out.println("Silahkan Masukkan Data Karyawan ke-" + i);
        System.out.println("NIP\t\t:");
        String nip = input.next();     
        System.out.println("Nama\t\t:");
        String nama = input.next();
        krj.setPegawai(nip, nama);
        System.out.println("Jumlah Jam Kerja:");
        int jjk = input.nextInt();
        System.out.println("=================================================");
        krj.setJamKerja(jjk);
        krj.hitungGajiHarian(jjk);
        krj.cetakPenghasilan();
        }
    }
}
