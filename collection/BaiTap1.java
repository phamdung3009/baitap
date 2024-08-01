package org.example.ontap.baitapvenha.day9.btvn.collection;
/*Bài 1: Tạo và hiển thị ArrayList
Tạo một ArrayList để lưu trữ tên các thành phố.
Thêm vài thành phố vào danh sách.
Hiển thị các thành phố trong danh sách.*/

import java.util.ArrayList;

public class BaiTap1 {
    public static void main(String[] args) {
        ArrayList<String> listCity = new ArrayList<>();
        listCity.add("HaNoi");
        listCity.add("HoChiMinh");
        listCity.add("DaNang");
        listCity.add("DaLat");

        /*for (int i = 0; i < listCity.size(); i++) {
            System.out.println((i + 1) + ": " + listCity.get(i));
            System.out.println("Hiển thị danh sách " + listCity);
            System.out.println("Hiển thị từng phần tử " + listCity.get(i));
        }*/
        int i = 0;
        for (String city : listCity) {
            i++;
            System.out.println(i + " : " + city);
        }

    }
}
