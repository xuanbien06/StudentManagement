package com.cmc.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Đánh dấu class này là Controller để xử lý các yêu cầu từ web
@RequestMapping("/home") // Đặt đường dẫn gốc cho toàn bộ file này là /home
public class HomeController {

    @GetMapping("/index") // Bắt URL /home/index
    @ResponseBody // Yêu cầu Spring Boot trả về đúng chuỗi chữ dưới đây, không tìm file HTML
    public String index() {
        return "Welcome to Spring Boot"; // Trả về câu chào
    }

    @GetMapping("/about") // Bắt URL /home/about
    @ResponseBody
    public String about() {
        return "Lại Xuân Biển"; // Trả về tên sinh viên theo yêu cầu đề bài
    }

    @GetMapping("/contact") // Bắt URL /home/contact
    @ResponseBody
    public String contact() {
        return "BIT240041@cmc.edu.vn"; // Trả về email sinh viên
    }
}