import java.util.Arrays;
import java.util.Scanner;

public class DanhSachBH implements ChucNangDS{
    private int n;
    BaoHanh dsbh[];

    Scanner sc = new Scanner(System.in);

    public DanhSachBH() {
        n = 0;
        dsbh = null;
    }

    public BaoHanh[] getDsbh(){
        return dsbh;
    }
    public void setDsbh(BaoHanh[] dsbh){
        this.dsbh = dsbh;
    }

    public void nhapDS() {
        System.out.println("Nhap vao so luong thiet bi can bao hanh: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println();
        dsbh = new BaoHanh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap vao san pham thu " + (i + 1) + ": ");
            BaoHanh bh = new BaoHanh();
            bh.Nhap();
            dsbh[i] = bh;
            System.out.println();
        }
    }

    public void them() {
        int them;
        System.out.println("Nhap vao so luong thiet bi can them vao danh sach bao hanh: ");
        them = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < them; i++) {
            BaoHanh add = new BaoHanh();
            add.Nhap();
            dsbh = Arrays.copyOf(dsbh, dsbh.length + 1);
            dsbh[n] = add;
            n++;
            System.out.println();
        }
    }

    public void timKiemTheo_MaBH() {
        System.out.println("Nhap vao ma bao hanh ban muon tim kiem: ");
        int mabh = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.printf("%-25s%-25s%-25s\n", "[MaBH]", "[ThoiGianBH]", "[ThongTinBH]");
        for (int i = 0; i < dsbh.length; i++) {
            if (dsbh[i].getMabh() == mabh) {
                dsbh[i].Xuat();
            }
        }
    }

    public void timKiemTheo_ThoiGianBH() {
        System.out.println("Nhap vao thoi gian ban muon tim: ");
        String thoigianbh = sc.nextLine();
        System.out.println();
        System.out.printf("%-25s%-25s%-25s\n", "[MaBH]", "[ThoiGianBH]", "[ThongTinBH]");
        for (int i = 0; i < dsbh.length; i++) {
            if (dsbh[i].getThoigianbh().equalsIgnoreCase(thoigianbh)) {
                dsbh[i].Xuat();
            }
        }
    }

    public void timKiemTheo_ThongTinBH() {
        System.out.println("Nhap vao thong tin can tim kiem: ");
        String thongtinbh = sc.nextLine();
        System.out.println();
        System.out.printf("%-25s%-25s%-25s\n", "[MaBH]", "[ThoiGianBH]", "[ThongTinBH]");
        for (int i = 0; i < dsbh.length; i++) {
            if (dsbh[i].getThongtinbh().equalsIgnoreCase(thongtinbh)) {
                dsbh[i].Xuat();
            }
        }
    }

    public void timKiem() {
        int luachon;
        do {
            System.out.println("1.Tim kiem theo ma bao hanh.");
            System.out.println("2.Tim kiem theo thoi gian bao hanh.");
            System.out.println("3.Tim kiem theo thong tin bao hanh.");
            System.out.println("4.Thoat.");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (luachon) {
                case 1:
                    timKiemTheo_MaBH();
                    System.out.println();
                    break;
                case 2:
                    timKiemTheo_ThoiGianBH();
                    System.out.println();
                    break;
                case 3:
                    timKiemTheo_ThongTinBH();
                    System.out.println();
                    break;
            }
        } while (luachon != 4);
    }

    public void suaTheo_MaBH(){
        System.out.println("Nhap vao ma bao hanh ban muon thay doi: ");
        int mabh = Integer.parseInt(sc.nextLine());
        for(int i=0;i<dsbh.length;i++){
            if(dsbh[i].getMabh() == mabh){
                dsbh[i].setMabh(mabh);
                dsbh[i].Xuat();
            }
        }
    }
    public void suaTheo_ThoiGianBH(){
        System.out.println("Nhap vao ma bao hanh ban muon thay doi: ");
        int mabh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao thoi gian ban muon sua: ");
        String thoigianbh = sc.nextLine();
        for(int i=0;i<dsbh.length;i++){
            if(dsbh[i].getMabh() == mabh){
                dsbh[i].setThongtinbh(thoigianbh);
                dsbh[i].Xuat(); 
            }
        }
    }
    public void suaTheo_ThongTinBH(){
        System.out.println("Nhap vao ma bao hanh ban muon thay doi: ");
        int mabh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao thong tin ban muon sua: ");
        String thongtinbh = sc.nextLine();
        for(int i=0;i<dsbh.length;i++){
            if(dsbh[i].getMabh() == mabh){
                dsbh[i].setThongtinbh(thongtinbh);
                dsbh[i].Xuat(); 
            }
        }
    }
    public void sua(){
        int luachon;
        do {
            System.out.println("1.Thay doi theo ma bao hanh.");
            System.out.println("2.Thay doi theo thoi gian bao hanh.");
            System.out.println("3.Thay doi theo thong tin bao hanh.");
            System.out.println("4.Thoat.");
            System.out.println("Nhap vao lua chon cua ban: ");
            luachon = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (luachon) {
                case 1:
                    suaTheo_MaBH();
                    System.out.println();
                    break;
                case 2:
                    suaTheo_ThoiGianBH();
                    System.out.println();
                    break;
                case 3:
                    suaTheo_ThongTinBH();
                    System.out.println();
                    break;
            }
        } while (luachon != 4);
    }
    public void xoa(){
        System.out.println("Nhap vao ma bao hanh ban muon xoa: ");
        int mabh = Integer.parseInt(sc.nextLine());
        for(int i=0;i<dsbh.length;i++){
            if(dsbh[i].getMabh() == mabh){
                dsbh[i] = dsbh[dsbh.length-1];
                dsbh = Arrays.copyOf(dsbh, dsbh.length-1);
                n--;
                i=0;
            }
        }
    }
    public void hienThi() {
        System.out.println();
        System.out.printf("%-25s%-25s%-25s\n", "[MaBH]", "[ThoiGianBH]", "[ThongTinBH]");
        for (int i = 0; i < dsbh.length; i++) {
            dsbh[i].Xuat();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachBH ds = new DanhSachBH();
        ds.nhapDS();
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
