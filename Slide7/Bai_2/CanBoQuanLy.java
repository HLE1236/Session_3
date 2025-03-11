public class CanBoQuanLy extends NhanVien implements QuanLy {
    private double loiNhuanCongTy; 
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public double tinhHoaHong() {
        return loiNhuanCongTy * 0.002; 
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }

    @Override
    public void inTTin() {
        System.out.println("Ten: " + tenNhanVien + ", Luong: " + tinhLuong() + ", Hoa hong: " + tinhHoaHong());
    }
}