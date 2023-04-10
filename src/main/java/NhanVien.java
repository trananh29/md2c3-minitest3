import java.util.Scanner;

public class NhanVien {
    protected String maNV;
    protected String nameNV;
    protected int ageNV;
    protected int phoneNV;
    protected String emailNV;
    protected String adressNV;

    public NhanVien() {
    }

    public NhanVien(String maNV, String nameNV, int ageNV, int phoneNV, String emailNV, String adressNV) {
        this.maNV = maNV;
        this.nameNV = nameNV;
        this.ageNV = ageNV;
        this.phoneNV = phoneNV;
        this.emailNV = emailNV;
        this.adressNV = adressNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNameNV() {
        return nameNV;
    }

    public void setNameNV(String nameNV) {
        this.nameNV = nameNV;
    }

    public int getAgeNV() {
        return ageNV;
    }

    public void setAgeNV(int ageNV) {
        this.ageNV = ageNV;
    }

    public int getPhoneNV() {
        return phoneNV;
    }

    public void setPhoneNV(int phoneNV) {
        this.phoneNV = phoneNV;
    }

    public String getEmailNV() {
        return emailNV;
    }

    public void setEmailNV(String emailNV) {
        this.emailNV = emailNV;
    }

    public String getAdressNV() {
        return adressNV;
    }

    public void setAdressNV(String adressNV) {
        this.adressNV = adressNV;
    }
    public double luong(){
        return 0;
    };
public void input(){
    Scanner sc1= new Scanner(System.in);
    System.out.println("Nhap ma nhan vien");
     this.maNV=sc1.nextLine();
    System.out.println("Nhap ten nhan vien");
     this.nameNV=sc1.nextLine();
    System.out.println("Nhap email nhan vien");
    this.emailNV =sc1.nextLine();
    System.out.println("Nhap dia chi nhan vien");
    this.adressNV=sc1.nextLine();
    System.out.println("Nhap tuoi nhan vien");
    this.ageNV= sc1.nextInt();
    System.out.println("Nhap sdt nhan vien");
    this.phoneNV=sc1.nextInt();
}
}
