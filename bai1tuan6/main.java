package bai1tuan6;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5, 3);
        double dienTich = hinhChuNhat.tinhDienTich();
        double chuVi = hinhChuNhat.tinhChuVi();
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }
}
