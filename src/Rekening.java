import java.util.Locale;

public abstract class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {                 // BARU: dipakai LaporanBank
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    public abstract int biayaAdminBulanan();

    public abstract String keterangan();         // BARU: pengganti cetakInfo()

    public int potongBiayaAdmin() {
        int biaya = biayaAdminBulanan();
        saldo -= biaya;
        return biaya;
    }

    protected static String formatRupiah(int jumlah) {
        return "Rp" + String.format(Locale.US, "%,d", jumlah).replace(',', '.');
    }
}