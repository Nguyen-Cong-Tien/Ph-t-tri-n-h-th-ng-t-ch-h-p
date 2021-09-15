public class Bai7 {
    private int tu, mau;
 
    public Bai7(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(Bai7 ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Bai7 phanSoTong = new Bai7(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(Bai7 ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Bai7 phanSoHieu = new Bai7(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void nhanPhanSo(Bai7 ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Bai7 phanSoTich = new Bai7(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(Bai7 ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Bai7 phanSoThuong = new Bai7(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    public void xuat(){
        System.out.println("Phan so duoc nhap la "+this.getTu()+"/"+this.getMau());
    }
    public void nghichdao(){
        int a,b,c;
        a=this.getTu();
        b=this.getMau();
        c=a;
        a=b;
        b=c;
        System.out.println("Nghich dao cua so: "+this.getTu()+"/"+this.getMau()+" la "+a+"/"+b);
    }
    public void giatrithuc(){
        double a;
        a=this.getTu()/this.getMau();
        System.out.println("Gia tri thuc cua phan so la: "+a);
    }
    public static void main(String[] args) {
        Bai7 phanSo1=new Bai7(12,3);    
        Bai7 phanSo2=new Bai7(4,6); 
        phanSo1.xuat();
        phanSo2.xuat();
        phanSo1.nghichdao();
        phanSo2.nghichdao();
        phanSo1.giatrithuc();
        phanSo2.giatrithuc();
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
}
