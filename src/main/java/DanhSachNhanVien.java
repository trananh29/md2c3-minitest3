import java.util.*;

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
    public void add(NhanVien a){
        danhsach.add(a);
    }
    public static NhanVien themNV() {
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
        return null;
    }
    public void themNVFullTime() {


      NhanVien abc=new NhanVienFullTime();
      abc.input();
      danhsach.add(abc);

    }
    public void themNVPartTime() {
    NhanVien abc=new NhanVienPartTime();
    abc.input();
    danhsach.add(abc);
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
    public void XoaNV(){
        System.out.println("Nhap ma nhan vien can xoa");
        Scanner sc4= new Scanner(System.in);
        String manv= sc4.nextLine();
        for (NhanVien abc: danhsach) {
            if(Objects.equals(abc.getMaNV(), manv)) {
                System.out.println("Thong tin nhan vien can xoa \n");
                System.out.println(abc);
                danhsach.remove(abc);
                break;
            }
        }
    }
    public void suaNV(){
        System.out.println("Nhap ma nhan vien can xoa");
        Scanner sc5= new Scanner(System.in);
        String manv= sc5.nextLine();
        int index=-1;
        for (int i=0;i<danhsach.size();i++) {
            if (Objects.equals(danhsach.get(i).getMaNV(), manv)) {
                index=i;
                break;
            }
        if (index!=-1) {
            System.out.println("Nhan vien co ma: " + manv +" ton tai, co ten la " + danhsach.get(index).getNameNV() );
        } if (index==-1) {
                System.out.println("Nhan vien khong ton tai");
            }


                if(danhsach.get(index) instanceof NhanVienFullTime) {
                    System.out.println("Nhap ma moi nhan vien"); String newManv=sc5.nextLine();
                    danhsach.get(index).setNameNV(newManv);
                }
           else if(danhsach.get(index) instanceof NhanVienPartTime) {
                    System.out.println("Nhap ma moi nhan vien"); String newManv=sc5.nextLine();
                    danhsach.get(index).setNameNV(newManv);
                }
        }
    }
}
