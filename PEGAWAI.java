/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA : INDAH RETNO IRIANI
 */
public class PEGAWAI {
    private String Nama, NIP;
    private double gajiPokok, lembur, uangMakan, transport, jumlahGaji;
    private int jumlahJamKerja;
    
    public void setJamKerja(int jumlahJamKerja){
       this.jumlahJamKerja = jumlahJamKerja;
    }
    public int getJamKerja(){
        return jumlahJamKerja = jumlahJamKerja;
    }
    public void setPegawai(String Nama, String NIP){
       this.Nama = Nama;
       this.NIP = NIP;
    }
    public String getPegawai(){
        return Nama = Nama;
    }
    public String getPegawai1(){
        return NIP = NIP;
    }
    public double getLembur(){
        if(jumlahJamKerja > 7){
            lembur = 3000;
        } else {
            lembur = 0;
        }
        return lembur = lembur;
    }
    public double getMakan(){
        if(jumlahJamKerja >= 8){
            uangMakan = 3500;
        } else {
            uangMakan = 0;
        }
        return uangMakan = uangMakan;
    }
    public double getTransport(){
        if(jumlahJamKerja >= 9){
            transport = 4000;
        } else {
            transport = 0;
        }
        return transport = transport;
    }
    public void hitungGajiHarian(int jjk){
        if(jjk <= 7){
            jumlahGaji = (jjk * 2000);
        } else if(jjk > 7 && jjk < 8){
            jumlahGaji = (jjk * 2000 + 3000);
        } else if(jjk >= 8 && jjk < 9){
            jumlahGaji = (jjk * 2000 + 6500);
        } else {
            jumlahGaji = (jjk * 2000 + 10500);
        } 
    }
    public void cetakPenghasilan(){
        System.out.println("=================================================");
        System.out.println("GAJI HARIAN PEGAWAI");
        System.out.println("Nama\t\t\t\t: " + getPegawai1());
        System.out.println("NIP\t\t\t\t: " + getPegawai());
        System.out.println("Jumlah Jam Kerja\t\t: " + getJamKerja() + " jam");
        System.out.println("Gaji Pokok (2000/jam)\t\t: Rp." + (jumlahJamKerja * 2000) + ".0");
        System.out.println("Uang Lembur\t\t\t: Rp." + getLembur());
        System.out.println("Tambahan Uang Makan\t\t: Rp." + getMakan());
        System.out.println("Transport Lembur\t\t: Rp." + getTransport());
        System.out.println("--------------------------------------------+");
        System.out.println("Jumlah Gaji Harian yang didapat\t: Rp." +jumlahGaji);
        System.out.println("=================================================");
          
    }
}
