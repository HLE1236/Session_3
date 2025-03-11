public abstract class NhanVien {
    protected String tenNhanVien;
    public static final double LUONG_MAX = 100000000;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
    }
}