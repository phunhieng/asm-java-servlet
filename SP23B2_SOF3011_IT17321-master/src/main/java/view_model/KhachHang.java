package view_model;

public class KhachHang {

    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String ngaySinh;
    private String sdt;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private String matKhau;

    public KhachHang() {
    }

    public KhachHang(String ma, String ten, String tenDem, String ho, String ngaySinh, String sdt, String diaChi, String thanhPho, String quocGia, String matKhau) {
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
        this.matKhau = matKhau;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public String getHo() {
        return ho;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tenDem='" + tenDem + '\'' +
                ", ho='" + ho + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", thanhPho='" + thanhPho + '\'' +
                ", quocGia='" + quocGia + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }
}
