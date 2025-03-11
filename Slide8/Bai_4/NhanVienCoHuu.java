public abstract class NhanVienCoHuu extends NhanVien {
    protected double luongCoBan;
    protected double heSoLuong;

    public NhanVienCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Lương cơ bản: " + luongCoBan + ", Hệ số lương: " + heSoLuong);
    }
}