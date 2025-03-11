import java.util.ArrayList;
import java.util.List;

public class PhongBan {
    private String tenPhongBan;
    private int soNhanVien;
    public static final int SO_NV_MAX = 100;
    private List<NhanVien> danhSachNV;

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
        this.danhSachNV = new ArrayList<>();
    }

    public boolean themNV(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            danhSachNV.add(nv);
            soNhanVien++;
            return true;
        }
        return false;
    }

    public NhanVien xoaNV() {
        if (soNhanVien > 0) {
            NhanVien nv = danhSachNV.remove(soNhanVien - 1);
            soNhanVien--;
            return nv;
        }
        return null;
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNV) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    public void inThongTin() {
        System.out.println("Phòng ban: " + tenPhongBan + ", Số nhân viên: " + soNhanVien);
        for (NhanVien nv : danhSachNV) {
            nv.inThongTin();
            System.out.println("Lương: " + nv.tinhLuong());
        }
        System.out.println("Tổng lương: " + tinhTongLuong());
    }
}