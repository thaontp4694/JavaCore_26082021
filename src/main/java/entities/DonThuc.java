package entities;

import java.util.Scanner;

public class DonThuc {
    private int a, n;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập biến a: ");
        this.a = sc.nextInt();
        System.out.print("Nhập biến n: ");
        this.n = sc.nextInt();
    }

    public void printDonThuc() {
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(a + "x");
        } else if (a == 0) {
            System.out.println("x");
        } else {
            System.out.println(a + "x" + "^" + n);
        }
    }

    public DonThuc multipleDonThuc(DonThuc another) {
        DonThuc kq = new DonThuc();
        kq.a = this.a * another.a;
        kq.n = this.n + another.n;
    return kq;
    }

    public DonThuc divideDonThuc(DonThuc another) {
        DonThuc kq = new DonThuc();
        kq.a = this.a / another.a;
        kq.n = this.n - another.n;
        return kq;
    }

    public void daoHamDonThuc() {
        this.a = this.a * this.n;
        this.n = this.n - 1;
    }

    public int tinhDonThucx0(int x0) {
        return (int) (a * Math.pow(x0, this.n));
    }

}
