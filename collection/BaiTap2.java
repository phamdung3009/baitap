package org.example.ontap.baitapvenha.day9.btvn.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//Khi nào nên sử dụng HashSet:
//Khi bạn cần một tập hợp các phần tử duy nhất.
//Khi thứ tự của các phần tử không quan trọng.
//Khi bạn cần các thao tác thêm, xóa, kiểm tra nhanh chóng.
public class BaiTap2 {
    /*    Sử dụng HashSet để loại bỏ các phần tử trùng lặp
        Tạo một danh sách các số nguyên có chứa các phần tử trùng lặp.
        Sử dụng HashSet để loại bỏ các phần tử trùng lặp và hiển thị danh sách không trùng lặp.*/
    public static void main(String[] args) {
        // Cách 1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i + " " + list.get(i));
//        }
//        int x = 0;
//        for (int number : list) {
//            x++;
//            System.out.println(x + " " +number);
//        }
        HashSet<Integer> hashSet = new HashSet<>(list);
        List<Integer> list2 = new ArrayList<>(hashSet);
        System.out.println(list2);
        int n = 0;
        for (Integer i : list2) {
            n++;
            System.out.println(n + " " + i);
        }
        // Cách 2
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        System.out.println(hashSet2);
        int number = 0;
        for (Integer integer : hashSet2) {
            number++;
            System.out.println(number + " " + integer);
        }
    }

}
