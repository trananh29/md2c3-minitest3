import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachNhanVien danhsachcuatao=new DanhSachNhanVien();
        int choice=0;
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
