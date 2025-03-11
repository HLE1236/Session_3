public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    private double loiNhuanCongTy;

    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public double tinhHoaHong() {
        return loiNhuanCongTy * 0.05; 
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }

    @Override
    public void inTTin() {
        System.out.println("Ten: " + tenNhanVien + ", Luong: " + tinhLuong() + ", Hoa hong: " + tinhHoaHong());
    }
}