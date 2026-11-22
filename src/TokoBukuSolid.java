public class TokoBukuSolid {
    public static void main(String[] args) {
        Buku javaBook = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        Buku algoritma = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        Buku oop = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        Buku kisah = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang pertama = new Keranjang();
        pertama.tambah(javaBook);
        pertama.tambah(algoritma);
        pertama.tambah(oop);
        pertama.tambah(kisah);

        Keranjang kedua = new Keranjang();
        kedua.tambah(oop);

        MetodeBayar[] pilihan = { new Tunai(), new Transfer(), new EWallet(), new Voucher(100000) };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", pertama);
        printer.cetakPembayaran(pertama.hitungTotal(), pilihan);

        System.out.println();

        printer.cetakKeranjang("KERANJANG KEDUA", kedua);
        printer.cetakPembayaran(kedua.hitungTotal(), pilihan);
    }
}