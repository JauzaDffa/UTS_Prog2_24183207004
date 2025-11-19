public class buku { 
  
    String judul;
    String penulis;
    String tahun_terbit;
    
    public void buku(){} //konstruktor tanpa parameter
    
    public void buku(String jd, String pn, String thn){ //konstruktor dengan parameter
        this.judul=jd;
        this.penulis=pn;
        this.tahun_terbit=thn;
    }
    
    public void tampil(){ //method tambahan
        System.out.println("===== INFO =====");
        System.out.println("judul buku: " + judul);
        System.out.println("penulis buku: " + penulis);
        System.out.println("tahun terbit buku: " + tahun_terbit);
    }
    //metod set
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
    //metod get
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }
}
