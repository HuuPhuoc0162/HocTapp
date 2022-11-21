import java.util.Arrays;
import java.util.Scanner;

public class DanhSachSP implements ChucNangDS {
    private int n;
    SanPham dssp[];
    Scanner sc = new Scanner(System.in);

    public DanhSachSP() {
        n = 0;
        dssp = null;
    }

    public SanPham[] getDssp() {
        return dssp;
    }

    public void setDssp(SanPham[] dssp) {
        this.dssp = dssp;
    }

    // nhập vào danh sách sản phẩm ban đầu
    void nhapds() {
        System.out.println("Nhap vao so luong san pham ban muon nhap vao danh sach: ");
        n = Integer.parseInt(sc.nextLine());
        dssp = new SanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[==========Moi ban nhap vao san pham thu " + (i + 1) + "==========]");
            SanPham sp = new SanPham();
            sp.Nhap();
            dssp[i] = sp;
            System.out.println();
        }
    }

    // hàm thêm sản phẩm
    public void them() {
        int them;
        System.out.println("Nhap vao so luong san pham can them: ");
        them = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < them; i++) {
            SanPham addsp = new SanPham();
            addsp.Nhap();
            dssp = Arrays.copyOf(dssp, dssp.length + 1);
            dssp[n] = addsp;
            n++;
            System.out.println();
        }
    }

    // hàm tìm kiếm sản phẩm
    public void timKiemTheo_MaSP() {
        System.out.println("Nhap vao ma SP ban muon tim: ");
        int masp = Integer.parseInt(sc.nextLine());
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getMasp() == masp) {
                dssp[i].Xuat();
            }
        }
    }

    public void timKiemTheo_TenSP() {
        System.out.println("Nhap vao ten SP ma ban muon tim: ");
        String tensp = sc.nextLine();
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getTensp().equalsIgnoreCase(tensp)) {
                dssp[i].Xuat();
            }
        }
    }

    public void timKiemTheo_GiaSP() {
        System.out.println("Nhap vao gia SP ban muon tim: ");
        double giasp = Double.parseDouble(sc.nextLine());
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getGiasp() == giasp) {
                dssp[i].Xuat();
            }
        }
    }

    public void timKiem() {
        int luachon;
        System.out.println("1.tim kiem theo ma SP");
        System.out.println("2.tim kiem theo ten SP");
        System.out.println("3.tim kiem theo gia SP");
        System.out.println("4.Thoat!");
        do {
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    timKiemTheo_MaSP();
                    break;
                case 2:
                    timKiemTheo_TenSP();
                    break;
                case 3:
                    timKiemTheo_GiaSP();
                    break;
            }
        } while (luachon != 4);
    }

    // public void timKiem(){
    //     int luachon;
    //     System.out.println("1.tim kiem theo gia SP");
    //     System.out.println("2.tim kiem theo ma SP");
    //     System.out.println("3.tim kiem theo ten SP");
    //     System.out.println("Nhap vao lua chon cua ban: ");
    //     luachon = Integer.parseInt(sc.nextLine());
    //     if(luachon == 1){
    //         timKiemTheo_GiaSP();
    //     }else if(luachon == 2){
    //         timKiemTheo_MaSP();
    //     }else if(luachon == 3){
    //         timKiemTheo_TenSP();
    //     }
    // }
    // hàm sửa đổi sản phẩm
    public void suaTheo_GiaSP() {
        System.out.println("nhap vao ten san pham ban muon sua gia: ");
        String tensp = sc.nextLine();
        System.out.println("Nhap vao gia ban muon sua: ");
        Double giasp = Double.parseDouble(sc.nextLine());
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getTensp().equalsIgnoreCase(tensp)) {
                dssp[i].setGiasp(giasp);
                dssp[i].Xuat();
            }
        }
    }

    public void suaTheo_ThongTinSP() {
        System.out.println("nhap vao ten san pham ban muon sua gia: ");
        String tensp = sc.nextLine();
        System.out.println("Nhap vao thong tin ban muon sua: ");
        String thongtinsp = sc.nextLine();
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getTensp().equalsIgnoreCase(tensp)) {
                dssp[i].setThongtinsp(thongtinsp);
                dssp[i].Xuat();
            }
        }
    }

    public void sua() {
        int luachon;
        do {
            System.out.println("**********Thay Doi**********");
            System.out.println("1.Sua gia SP");
            System.out.println("2.Sua thong tin SP");
            System.out.println("3.Thoat!");
            System.out.println("****************************");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    suaTheo_GiaSP();
                    break;
                case 2:
                    suaTheo_ThongTinSP();
                    break;
            }
        } while (luachon != 3);
    }

    public void xoa() {
        System.out.println("Nhap vao ma san pham ban muon xoa: ");
        int masp = Integer.parseInt(sc.nextLine());
        System.out.println();
        for (int i = 0; i < dssp.length; i++) {
            if (dssp[i].getMasp() == masp) {
                dssp[i] = dssp[dssp.length - 1];
                dssp = Arrays.copyOf(dssp, dssp.length - 1);
                n--;
            }
        }
    }

    public void hienThi() {
        System.out.println();
        System.out.println(
                "[=======================================================MENU=======================================================]");
        System.out.println();
        System.out.printf("  %-25s%-25s%-25s%-25s%-25s\n", "[MaSP]", "[TenSP]", "[SoluongSP]", "[GiaSP]",
                "[ThongtinSP]");
        for (int i = 0; i < dssp.length; i++) {
            dssp[i].Xuat();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSP ds = new DanhSachSP();
        ds.nhapds();
        ds.hienThi();
        int luachon;
        do {
            System.out.println("*********[LUA CHON]**********");
            System.out.println("1.Them san pham vao danh sach");
            System.out.println("2.Sua doi danh sach san pham");
            System.out.println("3.Tim san pham trong danh sach");
            System.out.println("4.Xoa san pham ");
            System.out.println("5.Thoat");
            System.out.println("******************************");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    ds.them();
                    ds.hienThi();
                    break;
                case 2:
                    ds.sua();
                    break;
                case 3:
                    ds.timKiem();
                    break;
                case 4:
                    ds.xoa();
                    ds.hienThi();
                    break;
            }
        } while (luachon != 5);
        ds.hienThi();
        sc.close();
    }
}
