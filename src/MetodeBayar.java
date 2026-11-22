public interface MetodeBayar {
    String nama();

    // KONTRAK: hasilnya tidak pernah negatif.
    int totalBayar(int totalBelanja);
}