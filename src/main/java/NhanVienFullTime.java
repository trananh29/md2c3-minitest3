public class NhanVienFullTime extends NhanVien{
    private double tienthuong;
    private double tienphat;
    private  double luongcung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String maNV, String nameNV, int ageNV, int phoneNV, String emailNV, String adressNV, double tienthuong, double tienphat, double luongcung) {
        super(maNV, nameNV, ageNV, phoneNV, emailNV, adressNV);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    @Override
    public double luong() {
        return getLuongcung() + getTienthuong() -getTienphat();
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "tienthuong=" + tienthuong +
                ", tienphat=" + tienphat +
                ", luongcung=" + luongcung +
                ", maNV='" + maNV + '\'' +
                ", nameNV='" + nameNV + '\'' +
                ", ageNV=" + ageNV +
                ", phoneNV=" + phoneNV +
                ", emailNV='" + emailNV + '\'' +
                ", adressNV='" + adressNV + '\'' +
                '}';
    }
}
