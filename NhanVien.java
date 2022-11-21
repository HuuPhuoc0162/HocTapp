public class NhanVien extends PERSON{
    private String idNV;
    private int chucvu;;
    public NhanVien(){
        super();
        idNV = null;
        chucvu = 0;
    }

    public NhanVien(String ten, String sdt, DiaChi dc, int tuoi, int chucvu, String idNV) {
        super(ten, sdt, dc, tuoi);
        this.idNV = idNV;
        this.chucvu = chucvu;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public void insertNV(){
        super.input_PS();
        System.out.print("Nhap id nhan vien: ");
        idNV = sc.nextLine();
        System.out.println("1. Nhan vien Fulltime");
        System.out.println("2. Nhan vien Parttime");
        System.out.println("3. Thoat!");
        System.out.print("Ban thuoc loai hoat dong nao (Vui long nhap 1 hoac 2): ");
        chucvu = Integer.parseInt(sc.nextLine());
    }
    public boolean loaiNV(int chucvu){
        if (chucvu == 1){
            return true;
        } else {
            return false;
        }
    }

    public void output_NV(){
        if (loaiNV(chucvu)){
            System.out.printf("%-15s", getIdNV());
            super.output_PS();
            System.out.printf("%-15s\n", "FT");
        } else {
            System.out.printf("%-15s", getIdNV());
            super.output_PS();
            System.out.printf("%-15s\n", "PT");
        }

    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.insertNV();
        nv.output_NV();
    }
}
