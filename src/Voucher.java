public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Versi awal: return totalBelanja - nilai;
        // Melanggar kontrak MetodeBayar (hasil tidak boleh negatif). Baris keranjang kedua:
        // Voucher Rp100.000    : Rp-36.000
        // Perbaikan: hasil dibatasi minimal nol.
        return Math.max(0, totalBelanja - nilai);
    }
}