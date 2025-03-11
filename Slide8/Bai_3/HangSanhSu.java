public class HangSanhSu extends HangHoa {
    private String loaiNguyenLieu;

    public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, 
                      String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public String toString() {
        return "Hàng sành sứ - " + super.toString() + 
               ", Loại nguyên liệu: " + loaiNguyenLieu;
    }
}