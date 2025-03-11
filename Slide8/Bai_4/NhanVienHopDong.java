public class NhanVienHopDong extends NhanVien {
    private double luongHopDong;

    public NhanVienHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    @Override
    public double tinhLuong() {
        return luongHopDong;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Lương hợp đồng: " + luongHopDong);
    }
}