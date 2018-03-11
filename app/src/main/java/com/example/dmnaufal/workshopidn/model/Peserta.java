package com.example.dmnaufal.workshopidn.model;

/**
 * Created by DMNaufal on 11/03/2018.
 */

public class Peserta {
    String nama;
    String usia;
    String alamat;

    public Peserta(String nama, String usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}