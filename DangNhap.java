import java.util.Scanner;

public class DangNhap {
    private String tenTaiKhoan;
    private String matKhau;
    private int n;
    TaoTaiKhoan dstk[];
    Scanner sc = new Scanner(System.in);

    public DangNhap() {
        this.tenTaiKhoan = null;
        this.matKhau = null;
        n = 1;
        dstk = null;
    }

    public TaoTaiKhoan[] getDstk() {
        return dstk;
    }

    public void setDstk(TaoTaiKhoan[] dstk) {
        this.dstk = dstk;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void nhapDS() {
        // System.out.println("Nhap vao so luong tai khoan ban muon tao: ");
        // n = Integer.parseInt(sc.nextLine());
        dstk = new TaoTaiKhoan[n];
        for (int i = 0; i < n; i++) {
            // System.out.println("[==========Moi ban nhap vao tai khoan thu " + (i + 1) +
            // "==========]");
            TaoTaiKhoan ttk = new TaoTaiKhoan();
            ttk.nhap();
            dstk[i] = ttk;
            System.out.println();
        }
    }

    public void nhapTK() {
        System.out.println("Nhap vao ten tai khoan: ");
        tenTaiKhoan = sc.nextLine();
        System.out.println("Nhap vao mat khau: ");
        matKhau = sc.nextLine();
    }

    public void ktra() {
        System.out.println();
        for (int i = 0; i < dstk.length; i++) {
            if (dstk[i].getTen().equalsIgnoreCase(tenTaiKhoan) && dstk[i].getMk().equalsIgnoreCase(matKhau)) {
                System.out.println("Dang nhap thanh cong!");
                System.out.println();
                // van dung vao viec lien ket trong menu
            } else if (dstk[i].getTen().equalsIgnoreCase(tenTaiKhoan) && !dstk[i].getMk().equalsIgnoreCase(matKhau)) {
                System.out.println("Dang nhap that bai, vui long kiem tra lai tai khoan va mat khau!");
                System.out.println();
            } else if (!dstk[i].getTen().equalsIgnoreCase(tenTaiKhoan) && dstk[i].getMk().equalsIgnoreCase(matKhau)) {
                System.out.println("Dang nhap that bai, vui long kiem tra lai tai khoan va mat khau!");
                System.out.println();
            } else {
                System.out.println("Tai khoan khong ton tai!");
                System.out.println();
            }
        }
    }

    public void thaoTac() {
        int luachon;
        do {
            System.out.println("1.Tao tai khoan");
            System.out.println("2.Dang nhap");
            System.out.println("3.Thoat");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            if (luachon > 0 && luachon < 3) {
                switch (luachon) {
                    case 1:
                        nhapDS();
                        break;
                    case 2:
                        nhapTK();
                        if (dstk == null) {
                            System.out.println();
                            System.out.println("Tai khoan khong ton tai!");
                            System.out.println();
                            thaoTac();
                            nhapDS();
                        } else if (dstk != null) {
                            ktra();
                        }
                        break;
                }
            } else {
                System.out.println("Nhap lai lua chon cua ban!");
            }
        } while (luachon != 3);
    }

    public static void main(String[] args) {
        DangNhap dn = new DangNhap();
        dn.thaoTac();
    }
}
