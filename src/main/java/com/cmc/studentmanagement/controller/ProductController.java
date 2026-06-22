package com.cmc.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product") // Đường dẫn gốc là /product
public class ProductController {

    // Truy cập: /product/detail/5
    @GetMapping("/detail/{id}")
    @ResponseBody
    public String getProductDetail(@PathVariable("id") String id) {
        // @PathVariable lấy giá trị {id} từ trên thanh URL đưa vào biến 'id'
        return "Product ID = " + id; // Ghép chuỗi và in ra màn hình
    }

    // Truy cập: /product/category?name=Laptop
    @GetMapping("/category")
    @ResponseBody
    public String getProductCategory(@RequestParam(value = "name", required = false) String name) {
        // @RequestParam lấy giá trị đằng sau dấu '?name='. required=false nghĩa là nếu không có cũng không sập web

        // Bài 3 yêu cầu: Nếu dữ liệu thiếu hoặc không hợp lệ, hiển thị thông báo lỗi
        if (name == null || name.trim().isEmpty()) {
            return "Lỗi: Dữ liệu category không hợp lệ hoặc bị thiếu!";
        }
        return "Category = " + name; // Nếu hợp lệ thì in ra
    }
}