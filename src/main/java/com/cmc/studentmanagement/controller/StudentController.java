package com.cmc.studentmanagement.controller;

import com.cmc.studentmanagement.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") // Đường dẫn gốc là /student
public class StudentController {

    @GetMapping("/info") // Bắt URL /student/info
    public String getStudentInfo(Model model) {
        // Tạo một đối tượng sinh viên với dữ liệu đề bài yêu cầu
        Student student = new Student("Nguyễn Văn A", 20, "Công nghệ thông tin");

        // Đóng gói đối tượng này vào biến "student" để gửi sang HTML
        model.addAttribute("student", student);

        // Trả về tên của file HTML nằm trong thư mục templates (không cần đuôi .html)
        return "student/info";
    }
}