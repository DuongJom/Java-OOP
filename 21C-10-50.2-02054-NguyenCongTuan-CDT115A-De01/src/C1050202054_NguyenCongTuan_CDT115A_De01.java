import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1050202054_NguyenCongTuan_CDT115A_De01 {

	public static void main(String[] args) throws IOException {
		List<TAINGHE> tainghes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tai nghe: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            TAINGHE tainghe = new TAINGHE();
            tainghe.nhap();
            tainghes.add(i,tainghe);
        }

        for(int i=0;i<n;i++){
            tainghes.get(i).xuat();
        }

        FileWriter fileWriter = new FileWriter("tainghe.dat");
        for(int i=0;i<n;i++){
            fileWriter.write(tainghes.get(i).toString()+"\n");
        }
        fileWriter.close();

        double tong=0;
        for(int i=0;i<n;i++){
            tong+=tainghes.get(i).thanhTien();
        }
        System.out.println("Tong tien: "+tong);
    }
}
