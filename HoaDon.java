import java.util.Scanner;

public class HoaDon {
    private String tenKH, tenNV, ngayInHD, hinhThucTT;
    private double thanhTien;
    private int idHD = 0;
    private SanPham[] dssp;
    protected KhachHang[] dskh;
    Scanner sc = new Scanner(System.in);
    public HoaDon(){
        tenKH = null;
        tenNV = null;
        ngayInHD = null;
        hinhThucTT = null;
        dssp = null;
        dskh = null;
        thanhTien = 0;
        idHD++;
    }
    public HoaDon(String tenKH, String tenNV, String ngayInHD, String hinhThucTT, double thanhTien, SanPham[] dssp, KhachHang[] dskh) {
        this.tenKH = tenKH;
        this.tenNV = tenNV;
        this.ngayInHD = ngayInHD;
        this.hinhThucTT = hinhThucTT;
        this.thanhTien = thanhTien;
        this.dssp = dssp;
        this.dskh = dskh;
        idHD++;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgayInHD() {
        return ngayInHD;
    }

    public void setNgayInHD(String ngayInHD) {
        this.ngayInHD = ngayInHD;
    }

    public String getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(String hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public SanPham[] getDssp() {
        return dssp;
    }

    public void setDssp(SanPham[] dssp) {
        this.dssp = dssp;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void input_HD(){
        System.out.print("Nhap ma khach hang: ");
        String makh = sc.nextLine();
        for (int i=0; i<dskh.length; i++){
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)){
                tenKH = dskh[i].getTen();
            }
        }
    }
    public void output(){
        System.out.println(tenKH);
    }

    public static void main(String[] args) {
        HoaDon hd = new HoaDon();
        hd.input_HD();
        hd.output();
    }
}
