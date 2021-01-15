package Ardian07159_Entity;

import java.util.Date;

public class Ardian07159_KorbanEntity {
   protected String nik,nama,pekerjaan,goldarah,
            agama,jeniskelamin, notelp,bantuan;
   protected Date TglLahir;
   
   public Ardian07159_KorbanEntity(String nik, String nama,
               String pekerjaan,String goldarah,String agama,
               String jeniskelamin,String notelp,Date TglLahir,
               String bantuan){
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.goldarah = goldarah;
        this.agama = agama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.bantuan = bantuan;
        this.TglLahir = TglLahir;
    }   
    public String getnik(){
        return nik;
    }   
    public void setnik(String nik) {
        this.nik = nik;
    }
    public String getnama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getpekerjaan() {
        return pekerjaan;
    }
    public void setpekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }    
    public String getgoldarah() {
        return goldarah;
    }
    public void setgoldarah(String goldarah) {
        this.goldarah = goldarah;
    }    
    public String getagama() {
        return agama;
    }
    public void setagama(String agama) {
        this.agama = agama;
    }    
    public String getjeniskelamin() {
        return jeniskelamin;
    }
    public void setjeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }    
    public String getnotelp() {
        return notelp;
    }
    public void setnotelp(String notelp) {
        this.notelp = notelp;
    }
    public String getbantuan() {
        return bantuan;
    }
    public void setbantuan(String bantuan) {
        this.bantuan = bantuan;
    }    
    public Date getTglLahir() {
        return TglLahir;
    }
    public void setTglLahir(Date TglLahir) {
        this.TglLahir = TglLahir;
    }   
}
