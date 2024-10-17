class PekerjaKantor extends Pekerja {
  
    public String jabatan;

    public PekerjaKantor(String nama, int umur, String jabatan) {
        super(nama, umur);  
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }
}