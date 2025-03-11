public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected String nhaSanXuat;
    protected double gia;

    public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Mã hàng: " + maHang + ", Tên hàng: " + tenHang + 
               ", Nhà sản xuất: " + nhaSanXuat + ", Giá: " + gia;
    }
}