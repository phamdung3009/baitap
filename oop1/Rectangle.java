package org.example.ontap.baitapvenha.day9.btvn.oop1;

public class Rectangle {
    /*    Bài 1: Viết một chương trình khai báo một lớp Rectangle có 2 thuộc tính là chiều dài và chiều rộng và có
        các phương thức sau:
        Hàm tạo không tham số.
        Hàm tạo có 2 tham số.
        Get/set cho các thuộc tính.
        Phương thức tính diện tích hình chữ nhật.
        Phương thức tính chu vi hình chữ nhật.*/
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "BaiTap1{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    public double dienTichHinhChuNhat(double chieuDai, double chieuRong) {
        double s = chieuDai * chieuRong;
        return s;
    }

    public double chuViHinhChuNhat(double chieuDai, double chieuRong) {
        double result = 2 * (chieuDai * chieuRong);
        return result;
    }
}
