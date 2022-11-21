import java.util.Scanner;

public class PERSON {
    private String ten;
    private String sdt;
    protected DiaChi dc;
    private int tuoi;
    Scanner sc = new Scanner(System.in);
    public PERSON(){
        ten = null;
        sdt = null;
        tuoi = 0;
        dc = new DiaChi();
    }

    public PERSON(String ten, String sdt, DiaChi dc, int tuoi) {
        this.ten = ten;
        this.sdt = sdt;
        this.dc = dc;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public DiaChi getDc() {
        return dc;
    }

    public void setDc(DiaChi dc) {
        this.dc = dc;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void input_PS(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        dc.input();
    }
    public void output_PS(){
        System.out.printf("%-25s%-10s%-20s%-35s", getTen(), getTuoi(), getSdt(), dc.output());
    }
}
