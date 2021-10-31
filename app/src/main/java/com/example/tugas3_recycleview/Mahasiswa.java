package com.example.tugas3_recycleview;

public class Mahasiswa {
    private String mNama,mNim,mAngkatan;
    private int mFoto;
    public Mahasiswa(int foto, String nama, String nim, String angkatan) {
        this.mFoto = foto;
        this.mNama = nama;
        this.mNim = nim;
        this.mAngkatan = angkatan;
    }

    public int getFoto(){
        return mFoto;
    }

    public String getNama() {
        return mNama;
    }

    public String getNim() {
        return mNim;
    }

    public String getAngkatan() {
        return mAngkatan;
    }
}
