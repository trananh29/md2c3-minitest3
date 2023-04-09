import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {
    public ArrayList<NhanVien> danhsach;

    public DanhSachNhanVien() {
        this.danhsach=new ArrayList<NhanVien>();
    }

    public DanhSachNhanVien(ArrayList<NhanVien> danhsach) {
        this.danhsach = danhsach;
    }

    public ArrayList<NhanVien> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<NhanVien> danhsach) {
        this.danhsach = danhsach;
    }
    public void themNVFullTime() {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Nhap ma nhan vien");
        String maNV1=sc1.nextLine();
        System.out.println("Nhap ten nhan vien");
        String name1=sc1.nextLine();
        System.out.println("Nhap email nhan vien");
        String email1=sc1.nextLine();
        System.out.println("Nhap dia chi nhan vien");
        String adr1=sc1.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        int age1= sc1.nextInt();
        System.out.println("Nhap sdt nhan vien");
        int phone1=sc1.nextInt();
        System.out.println("Nhap thuong  nhan vien");
        double thuong= sc1.nextDouble();
        System.out.println("Nhap tien phat nhan vien");
        double phat= sc1.nextDouble();
        System.out.println("Nhap tien luong cung nhan vien");
        double luong= sc1.nextDouble();
        NhanVien e= new NhanVienFullTime(maNV1,name1,age1,phone1,email1,adr1,thuong,phat,luong);
       danhsach.add(e);

    }
    public void themNVPartTime() {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Nhap ma nhan vien");
        String maNV1=sc1.nextLine();
        System.out.println("Nhap ten nhan vien");
        String name1=sc1.nextLine();
        System.out.println("Nhap email nhan vien");
        String email1=sc1.nextLine();
        System.out.println("Nhap dia chi nhan vien");
        String adr1=sc1.nextLine();
        System.out.println("Nhap tuoi nhan vien");
        int age1= sc1.nextInt();
        System.out.println("Nhap sdt nhan vien");
        int phone1=sc1.nextInt();
        System.out.println("Nhap gio lam them nhan vien");
        double lamthem1= sc1.nextDouble();
        NhanVien nv2= new NhanVienPartTime(maNV1,name1,age1,phone1,email1,adr1,lamthem1);
        danhsach.add(nv2);
    }
    public void display() {
        System.out.println("Danh sach toan bo nhan vien trong cong ty: \n");

        for (NhanVien abc: danhsach) {
            System.out.println(abc + "\n");
        }
    }
    public double luongTB() {
        double sumLuong=0;
        for (NhanVien f: danhsach) {
            sumLuong+= f.luong();
        }
        double luongTB=sumLuong/danhsach.size();
        System.out.println("Luong trung binh toan cong ty la  " + luongTB + " VND");
        return luongTB;
    }
    public void duoiDayXaHoi() {
        ArrayList<NhanVien> duoiDayXH= new ArrayList<>();
        for (NhanVien abc: danhsach) {
            if ( abc instanceof  NhanVienFullTime) {
                if (abc.luong()<luongTB()) {
                duoiDayXH.add(abc);
            }
            }

        }
        System.out.println("Danh sach nhan vien duoi day xa hoi trong cong ty \n");
        for (NhanVien abc: duoiDayXH) {
            System.out.println(abc + "\n");
        }
    }
    public double SumOfPartime () {
        double SumPT=0;
        for (NhanVien xyz: danhsach) {
            if (xyz instanceof  NhanVienPartTime) {
              SumPT+= xyz.luong();
            }
        }
        System.out.println("Tong luong nhan vien Partime cua cong ty la " + SumPT);
        return SumPT;
    }
    public void SortNVFultime (){
        ArrayList<NhanVien> sortNVFT=new ArrayList<>();
        for (NhanVien abc : danhsach) {
            if (abc instanceof NhanVienFullTime) {
                sortNVFT.add(abc);
            }
        }
        sortNVFT.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.luong(), o2.luong());
            }
        });
        System.out.println("Thu tu luong tang dan cua nhan vien Full Time" +"\n");
      for (NhanVien abc: sortNVFT) {
          System.out.println(abc +"\n");
      }
    }
}
