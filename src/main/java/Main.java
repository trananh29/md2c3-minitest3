import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachNhanVien danhsachcuatao=new DanhSachNhanVien();
        NhanVien nv1= new NhanVienFullTime("100","Anh",33,99,"anh@gmail.com","Ha Noi",500000,300000,9000000);
        danhsachcuatao.add(nv1);
        NhanVien nv2= new NhanVienFullTime("101","La",34,99,"anh@gmail.com","Ha Tay",500000,300000,8000000);
        danhsachcuatao.add(nv2);
        NhanVien nv3= new NhanVienFullTime("102","Ai",19,99,"anh@gmail.com","Ha Dong",500000,300000,2000000);
        danhsachcuatao.add(nv3);
        NhanVien nv4= new NhanVienFullTime("103","Trong",30,99,"anh@gmail.com","Ha Nam",500000,300000,5000000);
        danhsachcuatao.add(nv4);
        NhanVien nv5= new NhanVienFullTime("104","Trai",25,99,"anh@gmail.com","Ha ",500000,300000,7000000);
        danhsachcuatao.add(nv5);
        NhanVien nv6=new NhanVienPartTime("200","Tim",18,80,"em@gmail","Sai GOn",100);
        danhsachcuatao.add(nv6);
        NhanVien nv7=new NhanVienPartTime("201","Em",19,80,"em@gmail","HCM",200);
        danhsachcuatao.add(nv7);
        NhanVien nv8=new NhanVienPartTime("202","D",35,80,"em@gmail","Gia DInh",500);
        danhsachcuatao.add(nv8);
        NhanVien nv9=new NhanVienPartTime("203","C",22,80,"em@gmail","Phu Yen",500);
        danhsachcuatao.add(nv9);
        NhanVien nv10=new NhanVienPartTime("204","M",20,80,"em@gmail","Thanh Hoa" +
                "" +
                "",10);
        danhsachcuatao.add(nv10);
        int choice;
        do {
            Scanner sc3=new Scanner(System.in);

            System.out.println("Chao mung ban den voi danh sach quan li nhan vien.\n" +
                    "Bam nut tuy y de chon lua\n" +
                    "1. Them nhan vien full time\n" +
                    "2. Them nhan vien part time\n" +
                    "3. Hien thi luong trung binh toan cong ty\n" +
                    "4. Danh sach duoi day xa hoi Fulltime.\n" +
                    "5. Tong luong nhan vien parttime .\n" +
                    "6. Hien thi danh sach sap xep nhan vien full time tang dan.\n" +
                    "7. Hien thi danh sach toan bo nhan vien\n" +
                    "0. Exit \n");
            choice= sc3.nextInt();
            switch (choice) {
                case 1 -> danhsachcuatao.themNVFullTime();
                case 2 -> danhsachcuatao.themNVPartTime();
                case 3 -> danhsachcuatao.luongTB();
                case 4 -> danhsachcuatao.duoiDayXaHoi();
                case 5 -> danhsachcuatao.SumOfPartime();
                case 6 -> danhsachcuatao.SortNVFultime();
                case 7 -> danhsachcuatao.display();
            }

        } while (choice!=0);
    }
}
