/*
    21C-10-50.2-02054-NguyenCongTuan-CDT115A
 */

import java.util.Scanner;

public class PHUKIEN {
    private String MaPK;
    private String TenPK;
    private String MauSac;
    public PHUKIEN() {}

    public PHUKIEN(String maPK, String tenPK, String mauSac) {
        MaPK = maPK;
        TenPK = tenPK;
        MauSac = mauSac;
    }

    public String getMaPK() {
        return MaPK;
    }

    public void setMaPK(String maPK) {
        MaPK = maPK;
    }

    public String getTenPK() {
        return TenPK;
    }

    public void setTenPK(String tenPK) {
        TenPK = tenPK;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phu kien: ");
        this.setMaPK(sc.nextLine());
        System.out.println("Nhap ten phu kien: ");
        this.setTenPK(sc.nextLine());
        System.out.println("Nhap mau sac: ");
        this.setMauSac(sc.nextLine());
    }

    void xuat(){
        System.out.print(
                "MaPK='" + this.getMaPK() + '\'' +
                ", TenPK='" + this.getTenPK() + '\'' +
                ", MauSac='" + this.getMauSac() + '\''
        );
    }
    @Override
    public String toString() {
        return "MaPK='" + MaPK + '\'' +
                ", TenPK='" + TenPK + '\'' +
                ", MauSac='" + MauSac + '\'';
    }
}
