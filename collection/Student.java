package org.example.ontap.baitapvenha.day9.btvn.collection;
/*Tạo 1 class Student(id, name, clazz)
Tạo constructor, getter, setter, toString()
Tạo 1 HashSet Student
Thêm lần lượt 5 Student với id từ 1 đến 5, tên tùy ý, clazz tùy ý
Thêm 1 Student có thông tin giống 100% thông tin của Student với id = 1
Kiểm tra số lượng.
Nhận xét về kết quả*/

import java.sql.SQLOutput;
import java.util.HashSet;

public class Student {
    private int id;
    private String name;
    private String clazz;

    public Student() {
    }

    public Student(int id, String name, String clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
    }

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

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }


    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1, "Pham Hoang Dung", "Class A"));
        students.add(new Student(2, "Nguyen Van A", "Class B"));
        students.add(new Student(3, "Nguyen Van B", "Class C"));
        students.add(new Student(4, "Nguyen Van C", "Class D"));
        students.add(new Student(5, "Nguyen Van D", "Class E"));
        students.add(new Student(6, "Nguyen Van E", "Class F"));
        students.add(new Student(1, "Pham Hoang Dung", "Class A"));
//        System.out.println("Kiểm tra số lượng:" + students.size());
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println((i + 1) + " " + students);
//        }
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
