/*
    21C-10-50.2-02054-NguyenCongTuan-CDT115A
 */
import java.util.Scanner;

public class TAINGHE extends PHUKIEN{
    private String Loai;
    private int SoLuongMua;
    private double DonGiaBan;

    public TAINGHE() {
        super();
    }

    public TAINGHE(String maPK, String tenPK, String mauSac, String loai, int soLuongMua, double donGiaBan) {
        super(maPK, tenPK, mauSac);
        Loai = loai;
        SoLuongMua = soLuongMua;
        DonGiaBan = donGiaBan;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public int getSoLuongMua() {
        return SoLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        SoLuongMua = soLuongMua;
    }

    public double getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(double donGiaBan) {
        DonGiaBan = donGiaBan;
    }

    @Override
    public String toString() {
        return "TAINGHE{" +
                super.toString()+
                "Loai='" + Loai + '\'' +
                ", SoLuongMua=" + SoLuongMua +
                ", DonGiaBan=" + DonGiaBan +
                '}';
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap loai: ");
        this.setLoai(sc.nextLine());
        System.out.println("Nhap so luong mua: ");
        this.setSoLuongMua(sc.nextInt());
        System.out.println("Nhap don gia ban: ");
        this.setDonGiaBan(sc.nextDouble());
    }

    void xuat(){
        System.out.print("TAINGHE{");
        super.xuat();
        System.out.println(", Loai='" + Loai + '\'' +
                ", SoLuongMua=" + SoLuongMua +
                ", DonGiaBan=" + DonGiaBan+"}");
    }

    double thanhTien(){
        return this.getSoLuongMua()*this.getDonGiaBan();
    }
}
