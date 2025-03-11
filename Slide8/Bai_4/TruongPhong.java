public class TruongPhong extends NhanVienCoHuu {
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, 
                       double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap + (soNamDuongChuc * 1000000);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Phụ cấp: " + phuCap + ", Số năm đương chức: " + soNamDuongChuc);
    }
}