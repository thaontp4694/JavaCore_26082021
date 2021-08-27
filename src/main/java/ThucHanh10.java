import entities.DonThuc;
import entities.PhanSo;
import entities.TamGiac;

import java.util.Scanner;

public class ThucHanh10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
    Khai báo kiểu dữ liệu phân số (PHANSO)
    Nhập/Xuất phân số
    Rút gọn phân số
    Tính tổng, hiệu, tích, thương hai phân số
    Kiểm tra phân số tối giản
    Quy đồng hai phân số
    Kiểm tra phân số âm hay dương
    So sánh hai phân số
     */
//        System.out.println("----- PHÂN SỐ -----");
//        System.out.print("a/b 1: ");
//        String strPs1 = sc.nextLine();
//        PhanSo ps1 = PhanSo.parseFromString(strPs1);
//        ps1.print();
//        if (ps1.isReducible()) {
//            System.out.println("Phân số chưa tối giản.");
//        } else System.out.println("PHÂN SỐ TỐI GIẢN.");
//
//        if (ps1.isPositive()) {
//            System.out.println("PHÂN SỐ DƯƠNG.");
//        }
//
//        ps1.reduce();
//        ps1.print();
//
//        System.out.print("a/b 2: ");
//        String strPs2 = sc.nextLine();
//        PhanSo ps2 = PhanSo.parseFromString(strPs2);
//        ps2.print();
//
//        if (ps1.compareTo(ps2) < 0) {
//            // System.out.format("%d/%d < %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
//            // System.out.format("%s < %s", ps1.getDisplayString(), ps2.getDisplayString());
//            System.out.format("%s < %s\n", ps1, ps2);
//        } else if (ps1.compareTo(ps2) > 0) {
//            // System.out.format("%d/%d > %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
//            System.out.format("%s > %s\n", ps1, ps2);
//        } else {
//            // System.out.format("%d/%d == %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
//            System.out.format("%s == %s\n", ps1, ps2);
//        }
//
//        // int res = PhanSo.compare(ps1, ps2);
//        // int res = ps1.compareTo(ps2);
//
//        // PhanSo psTotal = PhanSo.sum(ps1,ps2);
//        // ps1.plus(ps2)
//
//        ps1.plus(ps2);
//        System.out.println(ps1);
//
//        PhanSo psTotal = PhanSo.sum(ps1, ps2);
//        System.out.println(psTotal);

    /* Tam giác
    Khai báo kiểu dữ lịêu tam giác (TAMGIAC)
    Nhập/Xuất tam giác
    Tính chu vi, diện tích tam giác */
//        System.out.println("----- TAM GIÁC -----");
//        TamGiac ABC = new TamGiac();
//        ABC.input();
//        ABC.printTamGiac();
//        System.out.format("Chu vi tam giác = %d\n",ABC.perimeterTamGiac());
//        System.out.format("Diện tích tam giác = %s\n",ABC.areaTamGiac());

    /* vĐơn thức
    Khai báo kiểu dữ liệu đơn thức (DONTHUC)
    Nhập/Xuất đơn thức
    Tính tích, thương hai đơn thức
    Tính đạo hàm cấp 1 của đơn thức
    Tính đạo hàm cấp k của đơn thức
    Tính giá trị đơn thức tại x = x0 */
        System.out.println("----- ĐƠN THỨC -----");
        System.out.println("Nhập đơn thức 1: ax^n");
        DonThuc dt1 = new DonThuc();
        dt1.input();
        dt1.printDonThuc();
        System.out.println("Nhập đơn thức 2: ax^n");
        DonThuc dt2 = new DonThuc();
        dt2.input();
        dt2.printDonThuc();
        System.out.print("Tích 2 đơn thức = ");
        DonThuc multiple = dt1.multipleDonThuc(dt2);
        multiple.printDonThuc();
        System.out.print("Thương 2 đơn thức = ");
        DonThuc division = dt1.divideDonThuc(dt2);
        division.printDonThuc();
        System.out.print("Đạo hàm bậc 1 của đơn thức 1: ");
        dt1.daoHamDonThuc();
        dt1.printDonThuc();
        System.out.print("Đạo hàm bậc 1 của đơn thức 2: ");
        dt2.daoHamDonThuc();
        dt2.printDonThuc();
        System.out.print("Nhập giá trị x của đơn thức ax^n: ");
        int x0 = new Scanner(System.in).nextInt();
        double kq = (dt1.getA() * x0) ^ dt1.getN();
        System.out.format("Giá trị của đơn thức 1 là: " + kq + "\n");
        double kq1 = (dt2.getA() * x0) ^ dt2.getN();
        System.out.format("Giá trị của đơn thức 2 là: " + kq1 + "\n");

    }
}
