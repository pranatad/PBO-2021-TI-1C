# Jawaban Pertanyaan Jobsheet 4

### Nama : Pranata Dito Fitriyansyah

### Kelas : 2C

### No. Absen : 17

## Pertanyaan percobaan 1

1.  Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk
    masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
2.  Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor
    default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis
    konstruktor tersebut ?
3.  Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut
    manakah yang bertipe object ?
4.  Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop
    memiliki relasi dengan class Processor ?
5.  Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
6.  Pada class MainPercobaan1, terdapat baris kode:

            Laptop l = new Laptop("Thinkpad", p);

    Apakah p tersebut ?
    Dan apakah yang terjadi jika baris kode tersebut diubah menjad

            Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));

Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

## Jawaban Percobaan 1

1.  Setter dan getter digunakan untuk mengeset dan mendapat value dari sebuah atribut
2.  Konstruktor default yaitu konstruktor yang ada otomatis saaat program dibuat, sedangkan Konstruktor Berparamater yaitu konstruktor yang menerima paramater
3.  Proc
4.  Berikut barisnya :

         Laptop(String merk, Processor proc) {
                this.merk = merk;
                this.proc = proc;

5.  Menampilkan/memanggil method info dari Processor proc
6.  p adalah insialisasi dari Processor, jika dipanggil maka akan mengeluarkan Intel i5 dan 3

Jika diubah, tidak akan terjadi perubahan, hasilnya tetap sama.

## Pertanyaan percobaan 2

1.  Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class
    Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
2.  Perhatikan method hitungBiayaSopir pada class Sopir, serta method
    hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus
    memiliki argument hari ?
3.  Perhatikan kode dari class Pelanggan. Untuk apakah perintah
    mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
4.  Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
    p.setSopir(s) ?
5.  Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
    tersebut ?
6.  Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method
    main dan amati perubahan saat di‑run!

            System.out.println(p.getMobil().getMerk());

    Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method
    main tersebut?

## Jawaban percobaan 2

1.  Berikut barisnya :

        Pelanggan(String nama, Mobil mobil, Sopir   sopir, int hari) {
            this.nama = nama;
            this.mobil = mobil;
            this.sopir = sopir;
            this.hari = hari;

    }

2.  Dikarenakan di dalamnya ada operasi yang terdapat argument hari
3.  Untuk mengembalikan hasil biaya mobil ditambah biaya sopir
4.  Untuk memanggil output yang telah diinputkan di Mobil m dan Sopir s
5.  Untuk memanggil method hitungBiayaTotal yang hasilnya akan mengeluarkan output biaya total
6.  Hasil modifikasi :

    <img src="percobaan2 (2).png">

    Jadi sintaks tersebut digunakan untuk mengeluarkan output Merk Mobil

## Pertanyaan percobaan 3

1.  Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ?
2.  Buatlah main program baru dengan nama class MainPertanyaan pada package yang
    sama. Tambahkan kode berikut pada method main() !

            Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
            KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
            System.out.println(keretaApi.info());

3.  Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?
4.  Perbaiki class KeretaApi sehingga program dapat berjalan !

## Jawaban percobaan 3

1. Digunakan untuk memanggil method info dari kelas Pegawai yang memiliki construktor masinis dan asisten
2. Kode Program MainPertanyaan :

   <img src="percobaan3 (1).png">

3. Output :

   <img src="percobaan3 (2).png">
   Hal ini terjadi dikarenakan pada class KeretaApi terdapat 4 dalam konstruktor yaitu nama,kelas,Pegawai masinis dan Pegawai asisten, sedangkan dalam MainPertanyaan yang dipanggil hanya 3 yaitu nama, kelas, dan pegawai masinis.

4. Perbaikan :

   <img src="percobaan3 (4).png">

   <img src="percobaan3 (5).png">

   dengan cara menghapus Pegawai asisten dan juga pada method info <b>(yang saya beri //)</b>
   Hasil :

   <img src="percobaan3 (6).png">

## Pertanyaan percobaan 4

1.  Pada main program dalam class MainPercobaan4 berapakah jumlah kursi dalam
    Gerbong A ?
2.  Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode
    tersebut ?

            ...
            if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
            }
            ...

3.  Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi
    dengan angka 1 ?
4.  Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru
    tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?
5.  Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
    penumpang lain !

## Jawaban percobaan 4

1. Ada 10
2. Artinya jika penumpang berisi data/tidak null, maka yang keluar adalah method info dari penumpang.info()
3. Bertujuan agar dapat berkurang/menurun
4. Yang terjadi adalah Budi akan menempati Kursi 1 Juga

   <img src="percobaan4 (1).png">

   <img src="percobaan4 (2).png">

5. Modifikasi :

   <img src="percobaan4 (3).png">
