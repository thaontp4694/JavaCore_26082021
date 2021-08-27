import entities.PhanSo;

import java.util.Scanner;

public class ThucHanh10 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("a/b 1: ");
            String strPs1 = sc.nextLine();
            PhanSo ps1 = PhanSo.parseFromString(strPs1);
            ps1.print();
            if (ps1.isReducible()) {
                System.out.println("Phân số chưa tối giản.");
            } else System.out.println("PHÂN SỐ TỐI GIẢN.");

            if (ps1.isPositive()) {
                System.out.println("PHÂN SỐ DƯƠNG.");
            }

            ps1.reduce();
            ps1.print();

            System.out.print("a/b 2: ");
            String strPs2 = sc.nextLine();
            PhanSo ps2 = PhanSo.parseFromString(strPs2);
            ps1.print();

            if (ps1.compareTo(ps2) < 0) {
                // System.out.format("%d/%d < %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
                // System.out.format("%s < %s", ps1.getDisplayString(), ps2.getDisplayString());
                System.out.format("%s < %s\n", ps1, ps2);
            } else if (ps1.compareTo(ps2) > 0) {
                // System.out.format("%d/%d > %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
                System.out.format("%s > %s\n", ps1, ps2);
            } else {
                // System.out.format("%d/%d == %d/%d\n", ps1.getTuSo(), ps1.getMauSo(), ps2.getTuSo(), ps2.getMauSo());
                System.out.format("%s == %s\n", ps1, ps2);
            }

            // int res = PhanSo.compare(ps1, ps2);
            // int res = ps1.compareTo(ps2);

            // PhanSo psTotal = PhanSo.sum(ps1,ps2);
            // ps1.plus(ps2)

            ps1.plus(ps2);
            System.out.println(ps1);

            PhanSo psTotal = PhanSo.sum(ps1, ps2);
            System.out.println(psTotal);

        }
}
