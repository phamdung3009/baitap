package org.example.ontap.baitapvenha.day9.btvn.oop3;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student sv1 = new Student();
        Student sv2 = new Student();
        Student sv3 = new Student();
        Scanner sc = new Scanner(System.in);
        // Nhập thông tin sinh viên sv1
        System.out.println("Nhập thông tin sinh viên sv1:");
        System.out.print("Mã sinh viên: ");
        sv1.setId(sc.nextInt());
        System.out.println("Tên sinh viên: ");
        sv1.setName(sc.next());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setTheoreticalPoints(sc.nextDouble());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setPracticePoint(sc.nextDouble());

        // Nhập thông tin sinh viên sv2
        System.out.println("Nhập thông tin sinh viên sv2:");
        System.out.print("Mã sinh viên: ");
        sv2.setId(sc.nextInt());
        System.out.println("Tên sinh viên: ");
        sv2.setName(sc.next());
        System.out.println("Nhập điểm lý thuyết: ");
        sv2.setTheoreticalPoints(sc.nextDouble());
        System.out.println("Nhập điểm thực hành: ");
        sv2.setPracticePoint(sc.nextDouble());

        // Nhập thông tin sinh viên sv3
        System.out.println("Nhập thông tin sinh viên sv3:");
        System.out.print("Mã sinh viên: ");
        sv3.setId(sc.nextInt());
        System.out.println("Tên sinh viên: ");
        sv3.setName(sc.next());
        System.out.println("Nhập điểm lý thuyết: ");
        sv3.setTheoreticalPoints(sc.nextDouble());
        System.out.println("Nhập điểm thực hành: ");
        sv3.setPracticePoint(sc.nextDouble());

        // In bảng danh sách sinh viên
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
        inThongTinSinhVien(sv1);
        inThongTinSinhVien(sv2);
        inThongTinSinhVien(sv3);
    }


    // Phương thức để in thông tin của một sinh viên
    public static void inThongTinSinhVien(Student sv) {
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                sv.getId(), sv.getName(), sv.getTheoreticalPoints(), sv.getPracticePoint(), sv.tinhDiemTrungBinh());
    }
}
