public abstract class NhanVien {
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
    public abstract double luong();
}
