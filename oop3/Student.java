package org.example.ontap.baitapvenha.day9.btvn.oop3;

public class Student {
    private int id;
    private String name;
    private double theoreticalPoints; // điểm lý thuyết
    private double practicePoint; // điểm thực hành

    // Constructor không tham số
    public Student() {

    }

    // Constructor có tham số
    public Student(int id, String name, double theoreticalPoints, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoreticalPoints = theoreticalPoints;
        this.practicePoint = practicePoint;
    }
    /*Phương thức
    Các getter và setter cho mỗi thuộc tính.*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoreticalPoints() {
        return theoreticalPoints;
    }

    public void setTheoreticalPoints(double theoreticalPoints) {
        this.theoreticalPoints = theoreticalPoints;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoreticalPoints=" + theoreticalPoints +
                ", practicePoint=" + practicePoint +
                '}';
    }

    public double tinhDiemTrungBinh() {
        double result = (theoreticalPoints + practicePoint) / 2;
        return result;
    }
}
