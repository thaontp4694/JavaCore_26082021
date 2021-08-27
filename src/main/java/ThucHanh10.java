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
//        ps1.print();
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
        System.out.println("----- TAM GIÁC -----");
        TamGiac ABC = new TamGiac();
        ABC.input();
        ABC.printTamGiac();
        System.out.format("Chu vi tam giác = %d\n",ABC.perimeterTamGiac());
        System.out.format("Diện tích tam giác = %s\n",ABC.areaTamGiac());

    }
}
