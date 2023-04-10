import java.util.Scanner;

public class NhanVienPartTime extends NhanVien{
    private double giolamthem;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String maNV, String nameNV, int ageNV, int phoneNV, String emailNV, String adressNV, double giolamthem) {
        super(maNV, nameNV, ageNV, phoneNV, emailNV, adressNV);
        this.giolamthem = giolamthem;
    }

    public double getGiolamthem() {
        return giolamthem;
    }

    public void setGiolamthem(double giolamthem) {
        this.giolamthem = giolamthem;
    }

    @Override
    public double luong() {
        return getGiolamthem()*100000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "luong =" + luong() +
                ", maNV='" + maNV + '\'' +
                ", nameNV='" + nameNV + '\'' +
                ", ageNV=" + ageNV +
                ", phoneNV=" + phoneNV +
                ", emailNV='" + emailNV + '\'' +
                ", adressNV='" + adressNV + '\'' +
                '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Nhap gio lam them");
        this.giolamthem= sc1.nextDouble();
    }
}
