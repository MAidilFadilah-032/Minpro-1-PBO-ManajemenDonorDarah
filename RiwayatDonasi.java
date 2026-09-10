package com.mycompany.main;

public class RiwayatDonasi {

    private int idDonasi;
    private int idDonor;
    private String tanggalDonasi;
    private int jumlahKantong;

    public RiwayatDonasi(int idDonasi, int idDonor, String tanggalDonasi, int jumlahKantong) {
        this.idDonasi = idDonasi;
        this.idDonor = idDonor;
        this.tanggalDonasi = tanggalDonasi;
        this.jumlahKantong = jumlahKantong;
    }

    public int getIdDonasi() {
        return idDonasi;
    }

    public void setIdDonasi(int idDonasi) {
        this.idDonasi = idDonasi;
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        this.idDonor = idDonor;
    }

    public String getTanggalDonasi() {
        return tanggalDonasi;
    }

    public void setTanggalDonasi(String tanggalDonasi) {
        this.tanggalDonasi = tanggalDonasi;
    }

    public int getJumlahKantong() {
        return jumlahKantong;
    }

    public void setJumlahKantong(int jumlahKantong) {
        this.jumlahKantong = jumlahKantong;
    }

    public void tampilkanData() {
        System.out.println("ID Donasi      : " + idDonasi);
        System.out.println("ID Donor       : " + idDonor);
        System.out.println("Tanggal Donasi : " + tanggalDonasi);
        System.out.println("Jumlah Kantong : " + jumlahKantong);
    }
}