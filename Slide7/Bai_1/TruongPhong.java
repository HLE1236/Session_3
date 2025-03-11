public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double heSoLuong, boolean tangLuong, double phuCap, double soNamDuongChuc) {
        super(tenNhanVien, heSoLuong, tangLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        double luongCoBan = super.tinhLuong();
        return luongCoBan + phuCap;
    }

    @Override
    public void inTTin() {
        System.out.println("Ten: " + tenNhanVien + ", Luong: " + tinhLuong() + ", Phu cap: " + phuCap);
    }
}