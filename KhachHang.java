public class KhachHang extends PERSON{
    private String idKH;
    public KhachHang() {
        super();
        this.idKH = null;
    }
    public KhachHang(String ten, String sdt, DiaChi dc, int tuoi, String idKH) {
        super(ten, sdt, dc, tuoi);
        this.idKH = idKH;
    }

    public String getIdKH() {
        return idKH;
    }
    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public void insert_KH(){
        System.out.print("Nhap id khach hang: ");
        idKH = sc.nextLine();
        super.input_PS();
    }
    public void output_KH(){
        System.out.printf("%-15s", getIdKH());
        super.output_PS();
        System.out.println();
    }
}
