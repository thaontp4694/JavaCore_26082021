package entities;

import java.util.Scanner;

public class TamGiac {
    private int a, b, c;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều dài cạnh A: ");
        this.a = sc.nextInt();
        System.out.print("Chiều dài cạnh B: ");
        this.b = sc.nextInt();
        System.out.print("Chiều dài cạnh C: ");
        this.c = sc.nextInt();
    }
    public boolean isTriangle() { //check xem có phải tam giác không
        if ((this.a + this.b > this.c) || (this.a + this.c > this.b) || (this.b + this.c > this.a)) {
            return true;
        }
        return false;
    }
    public void printTamGiac() {
        if (isTriangle()) {
            System.out.format("Tam giác ABC = (%d,%d,%d)\n", this.a, this.b, this.c);
        } else {
            System.out.println("Khong phai tam giac!");
        }
    }

    public int perimeterTamGiac() { //chu vi tam giac
        if (isTriangle()) {
            return this.a + this.b + this.c;
        }
        return 0;
    }

    public double areaTamGiac() { //dien tich tam giac
        if (isTriangle()) {
            double p = (double) (this.a + this.b + this.c) / 2;
            return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        }
        return 0;
    }
}
