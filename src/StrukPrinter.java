public class StrukPrinter {
    private static final int LEBAR = 41;

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        int sisi = (LEBAR - judul.length() - 2) / 2;
        String garis = "=".repeat(sisi);
        System.out.println(garis + " " + judul + " " + garis);
        for (Buku buku : keranjang.getIsi()) {
            System.out.println(buku.getJudul() + " (" + buku.getPenulis() + ")");
            System.out.printf("  %-11s : %s%n", "Harga", Buku.formatRupiah(buku.getHarga()));
            System.out.printf("  %-11s : %s%n", "Keterangan", buku.keterangan());
            System.out.printf("  %-11s : %s%n", "Harga akhir", Buku.formatRupiah(buku.hargaAkhir()));
        }
        System.out.println("-".repeat(40));
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-".repeat(14) + " PEMBAYARAN " + "-".repeat(15));
        for (MetodeBayar metode : pilihan) {
            System.out.printf("%-20s : %s%n", metode.nama(),
                    Buku.formatRupiah(metode.totalBayar(totalBelanja)));
        }
    }
}