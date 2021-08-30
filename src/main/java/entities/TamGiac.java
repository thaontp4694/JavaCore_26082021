package entities;

import java.util.Scanner;

public class TamGiac {

    //sửa bài
    private Diem d1, d2, d3;

    public TamGiac() {
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }

    public TamGiac(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac {\n");
        sb
                .append("  d1 = ").append("(").append(d1.getX()).append(", ").append(d1.getY()).append(")").append("\n")
                .append("  d2 = ").append("(").append(d2.getX()).append(", ").append(d2.getY()).append(")").append("\n")
                .append("  d3 = ").append("(").append(d3.getX()).append(", ").append(d3.getY()).append(")").append("\n")
                .append('}');
        return sb.toString();
    }

    public double calculatePerimeter() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        return a + b + c;
    }

    public double calculateArea() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
//    private int a, b, c;
//
//    public void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Chiều dài cạnh A: ");
//        this.a = sc.nextInt();
//        System.out.print("Chiều dài cạnh B: ");
//        this.b = sc.nextInt();
//        System.out.print("Chiều dài cạnh C: ");
//        this.c = sc.nextInt();
//    }
//    public boolean isTriangle() { //check xem có phải tam giác không
//        if ((this.a + this.b > this.c) || (this.a + this.c > this.b) || (this.b + this.c > this.a)) {
//            return true;
//        }
//        return false;
//    }
//    public void printTamGiac() {
//        if (isTriangle()) {
//            System.out.format("Tam giác ABC = (%d,%d,%d)\n", this.a, this.b, this.c);
//        } else {
//            System.out.println("Khong phai tam giac!");
//        }
//    }
//
//    public int perimeterTamGiac() { //chu vi tam giac
//        if (isTriangle()) {
//            return this.a + this.b + this.c;
//        }
//        return 0;
//    }
//
//    public double areaTamGiac() { //dien tich tam giac
//        if (isTriangle()) {
//            double p = (double) (this.a + this.b + this.c) / 2;
//            return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
//        }
//        return 0;
//    }
}
