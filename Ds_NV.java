import java.util.Scanner;
import java.util.Arrays;
public class Ds_NV implements ChucNangDS{
    private NhanVien[] dsnv;
    private int n;
    Scanner sc = new Scanner(System.in);
    public Ds_NV(){
        n = 0;
        dsnv = null;
    }
    public Ds_NV(NhanVien[] dsnv, int n) {
        this.dsnv = dsnv;
        this.n = n;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public NhanVien[] getDsnv() {
        return dsnv;
    }
    public void setDsnv(NhanVien[] dsnv) {
        this.dsnv = dsnv;
    }

    public void input_DSNV(){
        System.out.println("Nhap vao so luong nhan vien: ");
        n = Integer.parseInt(sc.nextLine());
        dsnv = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[==========Moi ban nhap vao nhan vien thu " + (i + 1) + "==========]");
            NhanVien nv = new NhanVien();
            nv.insertNV();
            dsnv[i] = nv;
            System.out.println();
        }
    }
    public void them() {
        int them;
        System.out.println("Nhap vao so luong nhan vien can them: ");
        them = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < them; i++) {
            NhanVien addnv = new NhanVien();
            addnv.insertNV();
            dsnv = Arrays.copyOf(dsnv, dsnv.length + 1);
            dsnv[n] = addnv;
            n++;
            System.out.println();
        }
    }

    // hàm tìm kiếm sản phẩm
    public void timKiemTheo_IDNV() {
        System.out.println("Nhap vao ID nhan vien ban muon tim: ");
        String manv =sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getIdNV().equalsIgnoreCase(manv)) {
                dsnv[i].output_NV();
            }
        }
    }

    public void timKiemTheo_TenNV() {
        System.out.println("Nhap vao ten nhan vien ma ban muon tim: ");
        String tennv = sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getTen().equalsIgnoreCase(tennv)) {
                dsnv[i].output_NV();
            }
        }
    }

//    public void timKiem() {
//        int lc;
//        System.out.println("1.Tim kiem theo ID nhan vien");
//        System.out.println("2.Tim kiem theo ten nhan vien");
//        System.out.println("3.Thoat!");
//        System.out.println("Nhap vao lua chon cua ban: ");
//        lc = Integer.parseInt(sc.nextLine());
//        switch (lc) {
//            case 1:
//                timKiemTheo_IDNV();
//                break;
//            case 2:
//                timKiemTheo_TenNV();
//                break;
//            case 3: return;
//        }
//    }

    public void timKiem() {
        int lc;
        System.out.println("1.Tim kiem theo ID nhan vien");
        System.out.println("2.Tim kiem theo ten nhan vien");
        System.out.println("3.Thoat!");
        System.out.println("Nhap vao lua chon cua ban: ");
        lc = Integer.parseInt(sc.nextLine());
        if (lc == 1) {
            timKiemTheo_IDNV();
        } else if (lc == 2){
            timKiemTheo_TenNV();
        }
    }
    // hàm sửa đổi sản phẩm
    public void sua_DiaChi() {
        System.out.print("Nhap vao ID nhan vien ban muon sua");
        String manv = sc.nextLine();
        System.out.print("nhap vao dia chi moi: ");
        DiaChi dcnv = new DiaChi();
        dcnv.input();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getIdNV().equalsIgnoreCase(manv)) {
                dsnv[i].setDc(dcnv);
                dsnv[i].output_NV();
            }
        }
    }

    public void sua_SDT() {
        System.out.print("Nhap vao ID nhan vien ban muon sua");
        String manv = sc.nextLine();
        System.out.print("Nhap vao so dien thoai moi: ");
        String sdtnv = sc.nextLine();
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getIdNV().equalsIgnoreCase(manv)) {
                dsnv[i].setSdt(sdtnv);
                dsnv[i].output_NV();
            }
        }
    }

    public void sua_Tuoi() {
        System.out.print("Nhap vao ID nhan vien ban muon sua");
        String manv = sc.nextLine();
        System.out.print("Nhap vao tuoi moi: ");
        int tuoinv = Integer.parseInt(sc.nextLine());
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getIdNV().equalsIgnoreCase(manv)) {
                dsnv[i].setTuoi(tuoinv);
                dsnv[i].output_NV();
            }
        }
    }

    public void sua() {
        int luachon;
        do {
            System.out.println("**********Thay Doi**********");
            System.out.println("1. Sua tuoi cua nhan vien");
            System.out.println("2. Sua so dien thoai cua nhan vien");
            System.out.println("3. Sua dia chi cua nhan vien");
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
        System.out.print("Nhap vao ID nhan vien ban muon xoa");
        String manv = sc.nextLine();
        System.out.println();
        for (int i = 0; i < dsnv.length; i++) {
            if (dsnv[i].getIdNV().equalsIgnoreCase(manv)) {
                dsnv[i] = dsnv[dsnv.length - 1];
                dsnv = Arrays.copyOf(dsnv, dsnv.length - 1);
                n--;
            }
        }
    }

    public void hienThi() {
        System.out.println("\n[=======================================================DANH SACH=======================================================]\n");
        System.out.printf("%-5s%-15s%-25s%-10s%-20s%-35s%-20s\n", "[STT]", "[ID]", "[Ten]", "[Tuoi]", "[So dien thoai]", "[Dia chi]", "[Loai HD]");
        for (int i = 0; i < dsnv.length; i++) {
            System.out.printf("%-5s", (i+1));
            dsnv[i].output_NV();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ds_NV dsnv = new Ds_NV();
        dsnv.input_DSNV();
        dsnv.hienThi();
        int luachon;
        do {
            System.out.println("*********[LUA CHON]**********");
            System.out.println("1. Them nhan vien vao danh sach");
            System.out.println("2. Sua doi danh sach nhan vien");
            System.out.println("3. Tim nhan vien trong danh sach");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Thoat");
            System.out.println("******************************");
            System.out.print("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    dsnv.them();
                    dsnv.hienThi();
                    break;
                case 2:
                    dsnv.sua();
                    break;
                case 3:
                    dsnv.timKiem();
                    break;
                case 4:
                    dsnv.xoa();
                    dsnv.hienThi();
                    break;
            }
        } while (luachon != 5);
        dsnv.hienThi();
    }
}
