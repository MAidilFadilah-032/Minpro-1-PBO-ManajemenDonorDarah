package com.mycompany.main;

public class Donor {

    private int id;
    private String nama;
    private String golonganDarah;
    private int umur;
    private String noTelepon;

    public Donor(int id, String nama, String golonganDarah, int umur, String noTelepon) {
        this.id = id;
        this.nama = nama;
        this.golonganDarah = golonganDarah;
        this.umur = umur;
        this.noTelepon = noTelepon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tampilkanData() {
        System.out.println("ID             : " + id);
        System.out.println("Nama           : " + nama);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur           : " + umur);
        System.out.println("No. Telepon    : " + noTelepon);
    }
}