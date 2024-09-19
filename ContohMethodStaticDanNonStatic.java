public class ContohMethodStaticDanNonStatic {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(20);
        System.out.println("Luas persegi: " + luasPersegi);

        ContohMethodStaticDanNonStatic object = new ContohMethodStaticDanNonStatic();
        object.tampikanPesanSelamatDatang("Liberly Djara");
    }

    public void tampikanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + " !");
    }
}
