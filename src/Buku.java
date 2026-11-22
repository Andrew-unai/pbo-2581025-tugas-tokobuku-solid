import java.util.Locale;

public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {                      // BARU: ketentuan 1 (SRP)
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();

    // tampilkanInfo() DIHAPUS: mencetak adalah tugas StrukPrinter (SRP)

    protected static String formatRupiah(int angka) {
        return "Rp" + String.format(Locale.US, "%,d", angka).replace(',', '.');
    }
}