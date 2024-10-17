public class Main {
    public static void main(String[] args) {
       
        Manajer manajer = new Manajer("Adi", 35, "Manajer Operasional", "Divisi Produksi");

        System.out.println("Nama: " + manajer.getNama());
        System.out.println("Umur: " + manajer.getUmur());
        System.out.println("Jabatan: " + manajer.getJabatan());
        System.out.println("Divisi: " + manajer.getDivisi());
    }
}
