public class LaporanBank {
    public void cetakDaftar(String judul, Rekening[] semua) {
        System.out.println(judul);
        for (Rekening rek : semua) {
            System.out.printf("%s | %-6s | %12s%n", rek.getNomor(), rek.getPemilik(), Rekening.formatRupiah(rek.getSaldo()));
            System.out.println("      " + rek.keterangan());
        }
    }

    public void cetakTotal(Rekening[] semua) {
        int total = 0;
        for (Rekening rek : semua) {
            total += rek.getSaldo();
        }
        System.out.println("-----------------------------------");
        System.out.println("Total dana bank : " + Rekening.formatRupiah(total));
    }
}