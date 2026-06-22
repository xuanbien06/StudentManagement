package com.cmc.studentmanagement.model;

public class Student {
    private String name;
    private int age;
    private String major;

    // Đây chính là Constructor (Hàm khởi tạo) đang bị thiếu khiến máy báo lỗi
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Các hàm Getter để lấy dữ liệu
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}