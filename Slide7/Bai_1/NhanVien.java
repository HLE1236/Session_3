public class NhanVien {
    public String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_CO_BAN = 750000;
    public static final double LUONG_MAX = 20000000;
    private boolean tangLuong;

    public NhanVien(String tenNhanVien, double heSoLuong, boolean tangLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
        this.tangLuong = tangLuong;
    }

    public double tinhLuong() {
        double luong = LUONG_CO_BAN * heSoLuong;
        if(tangLuong){}
        return (luong > LUONG_MAX) ? LUONG_MAX : luong;
    }

    public void inTTin() {
        System.out.println("Ten: " + tenNhanVien + ", Luong: " + tinhLuong());
    }
}