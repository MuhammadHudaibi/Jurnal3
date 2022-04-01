package com.company;

public class Profile {
    private String nip;
    private String nama;
    private String divisi;

    public Profile(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return	"Profile {nip='" + nip + '\'' +
                ", nama='" + nama + '\''
                + ", divisi='" + divisi + '\'' + "}" ;
    }
}