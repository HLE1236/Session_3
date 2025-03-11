public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, 
                       int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Hàng điện máy - " + super.toString() + 
               ", Thời gian bảo hành: " + thoiGianBaoHanh + " tháng" +
               ", Điện áp: " + dienAp + "V, Công suất: " + congSuat + "W";
    }
}