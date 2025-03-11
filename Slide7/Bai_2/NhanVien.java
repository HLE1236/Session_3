public class NhanVien {
    protected String tenNhanVien;
    protected double luongCoBan;
    protected double heSoLuong;
    public static final double LUONG_MAX = 20000000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        double luong = luongCoBan * heSoLuong;
        return (luong > LUONG_MAX) ? LUONG_MAX : luong;
    }

    public void inTTin() {
        System.out.println("Ten: " + tenNhanVien + ", Luong: " + tinhLuong());
    }
}