import java.util.Scanner;

public class DiaChi {
    private String sn, dg, q, tp; // moi quan he  HAS A
//    sn: so nha
//    dg: duong
//    q: quan
//    tp: thanh pho
    private int p;
//    p: phuong
    Scanner sc = new Scanner(System.in);
    public DiaChi(){
        sn = null;
        dg = null;
        q = null;
        tp = null;
        p = 0;
    }
    public DiaChi(String sn, String dq, String q, String tp, int p){
        this.sn = sn;
        this.dg = dg;
        this.q = q;
        this.tp = tp;
        this.p = p;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void input(){
        System.out.println("--Dia chi nha--");
        System.out.print("So nha: ");
        sn = sc.nextLine();
        System.out.print("Duong: ");
        dg = sc.nextLine();
        System.out.print("Phuong: ");
        p = Integer.parseInt(sc.nextLine());
        System.out.print("Quan: ");
        q = sc.nextLine();
        System.out.print("Thanh pho: ");
        tp = sc.nextLine();
    }
    public String output(){
        return(sn + " Duong " + dg + ", P, " + p + " Q" + q + ", TP." + tp);
    }
}
