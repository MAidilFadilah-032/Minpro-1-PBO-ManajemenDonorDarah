Nama: Muhammad Aidil Fadilah <br>
Nim: 2509116032 <br>
Kelas: Sistem Informasi (A) 2025 <br>

# Sistem Manajemen Donasi Darah<br>
Sistem Manajemen Donasi Darah adalah program CRUD (Create, Read, Update, Delete) berbasis Java yang dibuat untuk memenuhi tugas mini project mata kuliah Pemrograman Berorientasi Objek (PBO). Program ini mensimulasikan pengelolaan data pendonor darah beserta riwayat donasinya melalui antarmuka command-line (CLI) yang interaktif.
<br>
## Tampilan Awal Menu
<img width="496" height="225" alt="image" src="https://github.com/user-attachments/assets/a5f0f888-7c6e-40ec-8de4-929e17271c60" /><br>
Menu Utama, Tampilan awal saat program dijalankan. Pengguna memilih salah satu dari 4 menu (Kelola Data Donor, Kelola Data Donasi, Lihat Ringkasan, atau Keluar) dengan mengetikkan angka sesuai pilihan.

## 1. Kelola Data Donor
<img width="494" height="235" alt="image" src="https://github.com/user-attachments/assets/6d5e2f41-5ec0-475c-a780-ba90c93ccd72" /><br>
Submenu Kelola Data Donor Setelah memilih menu 1, program masuk ke submenu khusus data donor yang berisi 4 operasi CRUD (Tambah, Lihat, Update, Hapus) plus opsi kembali ke menu utama.
<br>
<img width="506" height="165" alt="image" src="https://github.com/user-attachments/assets/f17349ee-e456-4f59-8835-52a17164353f" /><br>
Tambah Donor Contoh input data donor baru (nama, golongan darah, umur, nomor telepon). Program memvalidasi data sebelum menyimpannya, lalu memberi ID otomatis (ID 1) sebagai konfirmasi data berhasil ditambahkan.
<br>
<img width="414" height="371" alt="image" src="https://github.com/user-attachments/assets/f2e037d7-c108-4756-a1d0-4d678185de7c" /><br>
Lihat Semua Donor Menampilkan seluruh data donor yang tersimpan dalam ArrayList, di sini terlihat 2 donor (Fariz dan Aidil) sudah terdaftar.
<br>
<img width="403" height="378" alt="image" src="https://github.com/user-attachments/assets/285eb669-78a5-45fb-867d-a66b9d7a7bbe" /><br>
Update Donor Contoh proses mengubah data donor dengan ID 1. Program meminta ID donor yang ingin diperbarui, lalu meminta seluruh data baru untuk menggantikan data lama.
<br>
<img width="403" height="378" alt="image" src="https://github.com/user-attachments/assets/8e532600-17aa-4926-b4b9-a04419ea3847" /><br>
Verifikasi Setelah Update Menampilkan ulang seluruh data donor untuk memastikan perubahan pada donor ID 1 (nama menjadi "Fariz Aufarizky", umur dan telepon berubah) sudah tersimpan dengan benar.
<br>
<img width="485" height="420" alt="image" src="https://github.com/user-attachments/assets/c1cf8767-5d1d-4ac9-973b-006bff9b1e16" /><br>
Hapus Donor Contoh proses menghapus data donor dengan ID 1. Program menampilkan data terlebih dahulu, lalu menghapus donor sesuai ID yang dimasukkan.
<br>
<img width="408" height="209" alt="image" src="https://github.com/user-attachments/assets/7d65c0ac-2de7-444d-849c-368b7042f2b8" /><br>
Verifikasi Setelah Hapus Menampilkan ulang data donor untuk memastikan donor ID 1 sudah terhapus, hanya tersisa donor ID 2 (Aidil).
<br><br>
## 2.	Kelola data donasi
<img width="494" height="419" alt="image" src="https://github.com/user-attachments/assets/6dfa8089-a40f-4ca4-9978-2a323bf368c7" /><br>
Submenu Kelola Data Donasi Setelah kembali ke menu utama dan memilih menu 2, program masuk ke submenu khusus data donasi dengan 4 operasi CRUD serupa (Catat, Lihat, Update, Hapus).
<br>
<img width="453" height="328" alt="image" src="https://github.com/user-attachments/assets/1e9cf9a3-832e-48e5-9075-e99d8af282ed" /><br>
Catat Donasi Baru Sebelum mencatat donasi, program menampilkan daftar donor yang tersedia agar pengguna tahu ID donor yang valid. Donasi baru dicatat dengan ID donor, tanggal, dan jumlah kantong darah.
<br>
<img width="439" height="391" alt="image" src="https://github.com/user-attachments/assets/27273084-5b0d-4bbb-8ab6-2679e829ce9f" /><br>
Lihat Semua Donasi Menampilkan seluruh riwayat donasi yang tersimpan, mencakup ID donasi, ID donor terkait, tanggal, dan jumlah kantong.
<br>
<img width="506" height="659" alt="image" src="https://github.com/user-attachments/assets/49ab74d0-7601-4c81-8e6f-ee90de659a5f" /><br>
Update Donasi Contoh proses mengubah data donasi dengan ID 1 (tanggal dan jumlah kantong diperbarui), diikuti tampilan ulang data untuk verifikasi perubahan berhasil tersimpan.
<br>
<img width="478" height="475" alt="image" src="https://github.com/user-attachments/assets/0fdbfcc3-c576-45b0-bb92-8b47370575cf" /><br>
Hapus Donasi Contoh proses menghapus data donasi dengan ID 1. Setelah dihapus, program menampilkan kembali daftar donasi yang kini kosong ("Belum ada data donasi") karena satu-satunya data donasi sudah dihapus.
<br><br>
## 3.	Lihat Ringkasan
<img width="490" height="334" alt="image" src="https://github.com/user-attachments/assets/65af1c60-7a15-4d3d-a907-470a2b9ca868" /><br>
Ringkasan Data Menampilkan rekap singkat: total donor yang terdaftar dan total donasi yang tercatat saat ini — berguna untuk melihat statistik data secara cepat tanpa perlu membuka daftar lengkap.
<br><br>
## 4. Penerapan Pengulangan
<img width="498" height="240" alt="image" src="https://github.com/user-attachments/assets/026b9f64-2d1b-45fc-8b12-1f83f557e6f5" /><br>
Jika user melakukan kesalahan dalam memberikan input omor maka program akan memberitahu kalau pilihan tidak tersedia, dan memunculkan lagi opsi tampilan menu utama.
