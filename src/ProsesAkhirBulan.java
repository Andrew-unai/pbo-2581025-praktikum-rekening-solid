public class ProsesAkhirBulan {
    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening rek : semua) {
            System.out.println(rek.getNomor() + " biaya admin  : " + Rekening.formatRupiah(rek.potongBiayaAdmin()));
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga b : berbunga) {
            System.out.println(b.getNomor() + " bunga        : " + Rekening.formatRupiah(b.tambahBunga()));
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening rek : semua) {
            if (rek.tarik(jumlah)) {
                System.out.println(rek.getNomor() + " autodebet    : " + Rekening.formatRupiah(jumlah));
            } else {
                System.out.println(rek.getNomor() + " autodebet    : gagal");
            }
        }
    }
}