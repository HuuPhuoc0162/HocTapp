import java.util.Scanner;

public class TaoTaiKhoan {
    private String ten;
    private String tuoi;
    private String email;
    private String std;
    private String mk;

    Scanner sc = new Scanner(System.in);
    public TaoTaiKhoan() {
        this.ten = null;
        this.tuoi = null;
        this.email = null;
        this.std = null;;
        this.mk = null;;
    }

    public TaoTaiKhoan(String ten, String tuoi, String email, String std, String mk) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.std = std;
        this.mk = mk;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getMk() {
        return mk;
    }

    public void nhap(){
        System.out.println("Nhap vao ten tai khoan ban muon tao: ");
        ten = sc.nextLine();
        System.out.println("Nhap vao tuoi cua ban: ");
        tuoi = sc.nextLine();
        System.out.println("Nhap vao emai cua ban: ");
        email = sc.nextLine();
        System.out.println("Nhap vao so dien thoai cua ban: ");
        std = sc.nextLine();
        System.out.println("Nhap vao mat khau ban muon tao: ");
        mk = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",ten,tuoi,email,std,mk);
    }
}
