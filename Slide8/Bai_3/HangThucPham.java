public class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, 
                        String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "Hàng thực phẩm - " + super.toString() + 
               ", Ngày sản xuất: " + ngaySanXuat + 
               ", Ngày hết hạn: " + ngayHetHan;
    }
}