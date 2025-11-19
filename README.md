# UTS_Prog2_24183207004
Nama : Jauza Daffa farrela
NPM  : 24183207004
Kelas: 3/a

# Penjelasan Program
Program yang saya menggunakan 2(dua) class ,yaitu kelas data dan kelas utama

1. **buku.Class** / kelas data
//diprogram ini saya menggunakan atribut buku yang dimana terdapat komponen antara lain seperti://
* judul
* penulis
* tahun terbit

//Memiliki 2 fungsi konstruktor//
  1. Konstruktor tanpa parameter dengan kode:"public void buku() {}" ,membuat objek/data tanpa mengisi data dulu
  2. Konstruk tor berparameter dengan kode:"public void buku(String jd, String pn, String thn){"  ,dengan fungsi mengisi data saat akan dibuat
 
 //Method tampil()//
  Method ini berfungsi untuk menampilkan data buku ke layar.

  //Set: mengisi nilai pada atribut//
  //Get: mengambil/menampilkan nilai atribut//

2. **Main.Class** / Kelas Utama
   static ArrayList<buku> DataBase = new ArrayList<>(); global variabel dari array list untuk simpan data baru.

   dimain class program ini memiliki beberapa method:
   a.) opsi awal () :digunakan menampilkan menu
   b.) tambah data() : digunakan menambah data ke dalam database
   c.) tambil semua data() :digunakan menampilan data/buku yang sudah disi sebelumnya
   d.) keluar program() : digunakan untuk menghentikan program

   dapat disimpulkan hubungan antara kelas utama sebagai logika program, sedangkan kelas data menjadi wadah menampung data
   Program ini diibaratkan sebagai program perpustakaan sederhana yang dapat menampilakan penambahan buku, menampilkan data      buku, dan keluar program

  
     
