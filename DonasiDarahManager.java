package com.mycompany.main;

import java.util.ArrayList;

public class DonasiDarahManager {

    private ArrayList<Donor> daftarDonor;
    private ArrayList<RiwayatDonasi> daftarDonasi;

    private int jumlahIdDonor;
    private int jumlahIdDonasi;

    public DonasiDarahManager() {
        daftarDonor = new ArrayList<Donor>();
        daftarDonasi = new ArrayList<RiwayatDonasi>();
        jumlahIdDonor = 0;
        jumlahIdDonasi = 0;
    }

    public void tambahDonor(String nama, String golonganDarah, int umur, String noTelepon) {
        boolean dataValid = true;

        if (nama.equals("")) {
            System.out.println("Gagal: nama tidak boleh kosong.");
            dataValid = false;
        } else if (!(golonganDarah.equals("A") || golonganDarah.equals("B")
                || golonganDarah.equals("AB") || golonganDarah.equals("O"))) {
            System.out.println("Gagal: golongan darah harus A, B, AB, atau O.");
            dataValid = false;
        } else if (umur < 17 || umur > 65) {
            System.out.println("Gagal: umur pendonor harus antara 17 sampai 65 tahun.");
            dataValid = false;
        }

        if (dataValid) {
            jumlahIdDonor = jumlahIdDonor + 1;
            Donor donorBaru = new Donor(jumlahIdDonor, nama, golonganDarah, umur, noTelepon);
            daftarDonor.add(donorBaru);
            System.out.println("Data donor berhasil ditambahkan dengan ID " + jumlahIdDonor);
        }
    }

    // READ - menampilkan semua data (Materi: perulangan for pada ArrayList)
    public void tampilkanSemuaDonor() {
        if (daftarDonor.size() == 0) {
            System.out.println("Belum ada data donor.");
        } else {
            for (int i = 0; i < daftarDonor.size(); i++) {
                System.out.println("-----------------------------");
                daftarDonor.get(i).tampilkanData();
            }
            System.out.println("-----------------------------");
        }
    }

    public Donor cariDonorById(int id) {
        Donor hasil = null;
        for (int i = 0; i < daftarDonor.size(); i++) {
            if (daftarDonor.get(i).getId() == id) {
                hasil = daftarDonor.get(i);
            }
        }
        return hasil;
    }

    public void updateDonor(int id, String nama, String golonganDarah, int umur, String noTelepon) {
        int indexDitemukan = -1;
        for (int i = 0; i < daftarDonor.size(); i++) {
            if (daftarDonor.get(i).getId() == id) {
                indexDitemukan = i;
            }
        }

        if (indexDitemukan == -1) {
            System.out.println("Gagal: data donor dengan ID " + id + " tidak ditemukan.");
        } else if (nama.equals("")) {
            System.out.println("Gagal: nama tidak boleh kosong.");
        } else if (!(golonganDarah.equals("A") || golonganDarah.equals("B")
                || golonganDarah.equals("AB") || golonganDarah.equals("O"))) {
            System.out.println("Gagal: golongan darah harus A, B, AB, atau O.");
        } else if (umur < 17 || umur > 65) {
            System.out.println("Gagal: umur pendonor harus antara 17 sampai 65 tahun.");
        } else {
            Donor donorBaru = new Donor(id, nama, golonganDarah, umur, noTelepon);
            daftarDonor.set(indexDitemukan, donorBaru);
            System.out.println("Data donor ID " + id + " berhasil diperbarui.");
        }
    }

    public void hapusDonor(int id) {
        int indexDitemukan = -1;
        for (int i = 0; i < daftarDonor.size(); i++) {
            if (daftarDonor.get(i).getId() == id) {
                indexDitemukan = i;
            }
        }

        if (indexDitemukan == -1) {
            System.out.println("Gagal: data donor dengan ID " + id + " tidak ditemukan.");
        } else {
            daftarDonor.remove(indexDitemukan);
            System.out.println("Data donor ID " + id + " berhasil dihapus.");
        }
    }

    public void tambahDonasi(int idDonor, String tanggal, int jumlahKantong) {
        Donor donor = cariDonorById(idDonor);

        if (donor == null) {
            System.out.println("Gagal: donor dengan ID " + idDonor + " tidak ditemukan.");
        } else if (jumlahKantong <= 0) {
            System.out.println("Gagal: jumlah kantong darah harus lebih dari 0.");
        } else {
            jumlahIdDonasi = jumlahIdDonasi + 1;
            RiwayatDonasi donasiBaru = new RiwayatDonasi(jumlahIdDonasi, idDonor, tanggal, jumlahKantong);
            daftarDonasi.add(donasiBaru);
            System.out.println("Donasi berhasil dicatat dengan ID " + jumlahIdDonasi);
        }
    }

    public void tampilkanSemuaDonasi() {
        if (daftarDonasi.size() == 0) {
            System.out.println("Belum ada data donasi.");
        } else {
            for (int i = 0; i < daftarDonasi.size(); i++) {
                System.out.println("-----------------------------");
                daftarDonasi.get(i).tampilkanData();
            }
            System.out.println("-----------------------------");
        }
    }

    public void updateDonasi(int id, String tanggal, int jumlahKantong) {
        int indexDitemukan = -1;
        for (int i = 0; i < daftarDonasi.size(); i++) {
            if (daftarDonasi.get(i).getIdDonasi() == id) {
                indexDitemukan = i;
            }
        }

        if (indexDitemukan == -1) {
            System.out.println("Gagal: data donasi dengan ID " + id + " tidak ditemukan.");
        } else if (jumlahKantong <= 0) {
            System.out.println("Gagal: jumlah kantong darah harus lebih dari 0.");
        } else {
            int idDonorLama = daftarDonasi.get(indexDitemukan).getIdDonor();
            RiwayatDonasi donasiBaru = new RiwayatDonasi(id, idDonorLama, tanggal, jumlahKantong);
            daftarDonasi.set(indexDitemukan, donasiBaru);
            System.out.println("Data donasi ID " + id + " berhasil diperbarui.");
        }
    }

    public void hapusDonasi(int id) {
        int indexDitemukan = -1;
        for (int i = 0; i < daftarDonasi.size(); i++) {
            if (daftarDonasi.get(i).getIdDonasi() == id) {
                indexDitemukan = i;
            }
        }

        if (indexDitemukan == -1) {
            System.out.println("Gagal: data donasi dengan ID " + id + " tidak ditemukan.");
        } else {
            daftarDonasi.remove(indexDitemukan);
            System.out.println("Data donasi ID " + id + " berhasil dihapus.");
        }
    }

    public int getJumlahDonor() {
        return daftarDonor.size();
    }

    public int getJumlahDonasi() {
        return daftarDonasi.size();
    }
}