public class ContohOverLoading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuas(double jarijari, boolean isiLingkaran) {
        if (isiLingkaran) {
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4, 6);
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(4, true);
        System.out.println("Luas lingkaran: " + luasLingkaran);
    }
}
