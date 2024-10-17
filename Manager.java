class Manajer extends PekerjaKantor {
 
    public String divisi;

    public Manajer(String nama, int umur, String jabatan, String divisi) {
        super(nama, umur, jabatan);  
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }
}