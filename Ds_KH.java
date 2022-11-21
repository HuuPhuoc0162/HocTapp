import java.util.Arrays;
import java.util.Scanner;

public class Ds_KH implements ChucNangDS{
    protected KhachHang[] dskh;
    private int n;
    Scanner sc = new Scanner(System.in);
    public Ds_KH(){
        n = 0;
        dskh = null;
    }
    public Ds_KH(KhachHang[] dskh, int n) {
        this.dskh = dskh;
        this.n = n;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public KhachHang[] getDsnv() {
        return dskh;
    }
    public void setDsnv(KhachHang[] dskh) {
        this.dskh= dskh;
    }

    public void input_DSKH(){
        System.out.println("Nhap vao so luong khach hang: ");
        n = Integer.parseInt(sc.nextLine());
        dskh = new KhachHang[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[==========Moi ban nhap vao khach hang thu " + (i + 1) + "==========]");
            KhachHang kh = new KhachHang();
            kh.insert_KH();
            dskh[i] = kh;
            System.out.println();
        }
    }
    public void them() {
        int them;
        System.out.println("Nhap vao so luong khach hang can them: ");
        them = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < them; i++) {
            KhachHang addkh = new KhachHang();
            addkh.insert_KH();
            dskh = Arrays.copyOf(dskh, dskh.length + 1);
            dskh[n] = addkh;
            n++;
            System.out.println();
        }
    }

    // hàm tìm kiếm sản phẩm
    public void timKiemTheo_IDKH() {
        System.out.println("Nhap vao ID khach hang ban muon tim: ");
        String makh =sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)) {
                dskh[i].getTen();
            }
        }
    }

    public void timKiemTheo_TenKH() {
        System.out.print("Nhap vao ten khach hang ma ban muon tim: ");
        String tenkh = sc.nextLine();
        System.out.print("Nhap vao so dien thoai khach hang ma ban muon tim: ");
        String sdtkh = sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getTen().equalsIgnoreCase(tenkh) && dskh[i].getSdt().equalsIgnoreCase(sdtkh)) {
                dskh[i].output_KH();
            }
        }
    }

    public void timKiem() {
        int lc;
        System.out.println("1. Tim kiem theo ID khach hang");
        System.out.println("2. Tim kiem theo ten khach hang");
        System.out.println("4. Thoat!");
        System.out.println("Nhap vao lua chon cua ban: ");
        lc = Integer.parseInt(sc.nextLine());
       if (lc == 1) {
           timKiemTheo_IDKH();
       } else if (lc == 2){
           timKiemTheo_TenKH();
        }
    }

    // hàm sửa đổi khách hàng
    public void sua_DiaChi() {
        System.out.print("Nhap vao ID khach hang ban muon sua");
        String makh = sc.nextLine();
        System.out.print("nhap vao dia chi moi: ");
        DiaChi dckh = new DiaChi();
        dckh.input();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)) {
                dskh[i].setDc(dckh);
                dskh[i].output_KH();
            }
        }
    }

    public void sua_SDT() {
        System.out.print("Nhap vao ID khach hang ban muon sua");
        String makh = sc.nextLine();
        System.out.print("Nhap vao so dien thoai moi: ");
        String sdtkh = sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)) {
                dskh[i].setSdt(sdtkh);
                dskh[i].output_KH();
            }
        }
    }

    public void sua_Tuoi() {
        System.out.print("Nhap vao ID khach hang ban muon sua");
        String makh = sc.nextLine();
        System.out.print("Nhap vao tuoi moi: ");
        int tuoikh = Integer.parseInt(sc.nextLine());
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)) {
                dskh[i].setTuoi(tuoikh);
                dskh[i].output_KH();
            }
        }
    }

    public void sua() {
        int luachon;
        do {
            System.out.println("**********Thay Doi**********");
            System.out.println("1. Sua tuoi cua khach hang");
            System.out.println("2. Sua so dien thoai cua khach hang");
            System.out.println("3. Sua dia chi cua khach hang");
            System.out.println("4. Thoat!");
            System.out.println("****************************");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    sua_Tuoi();
                    break;
                case 2:
                    sua_SDT();
                    break;
                case 3:
                    sua_DiaChi();
                    break;
            }
        } while (luachon != 4);
    }

    public void xoa() {
        System.out.print("Nhap vao ID khach hang ban muon xoa");
        String makh = sc.nextLine();
        System.out.println();
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getIdKH().equalsIgnoreCase(makh)) {
                dskh[i] = dskh[dskh.length - 1];
                dskh = Arrays.copyOf(dskh, dskh.length - 1);
                n--;
            }
        }
    }

    public void hienThi() {
        System.out.println("\n[=======================================================DANH SACH=======================================================]\n");
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]");
        for (int i = 0; i < dskh.length; i++) {
            System.out.printf("%-5s", (i+1));
            dskh[i].output_KH();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ds_KH dskh = new Ds_KH();
        HoaDon hd = new HoaDon();
        dskh.input_DSKH();
        dskh.hienThi();
        int luachon;
        do {
            System.out.println("*********[LUA CHON]**********");
            System.out.println("1. Them khach hang vao danh sach");
            System.out.println("2. Sua doi danh sach khach hang");
            System.out.println("3. Tim khach hang trong danh sach");
            System.out.println("4. Xoa khach hang");
            System.out.println("5. In hoa don");
            System.out.println("6. Thoat");
            System.out.println("******************************");
            System.out.print("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    dskh.them();
                    dskh.hienThi();
                    break;
                case 2:
                    dskh.sua();
                    break;
                case 3:
                    dskh.timKiem();
                    break;
                case 4:
                    dskh.xoa();
                    dskh.hienThi();
                    break;
                case 5:
                    hd.input_HD();
                    hd.output();
            }
        } while (luachon != 6);
        dskh.hienThi();
    }
}
