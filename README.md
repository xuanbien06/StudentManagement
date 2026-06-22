# Bài Tập Thực Hành

## 🎥 Video thuyết minh báo cáo 
Bấm vào đường link dưới đây để xem video quá trình chạy thử ứng dụng và giải thích mã nguồn:
👉 [XEM VIDEO THUYẾT MINH BÀI TẬP TẠI ĐÂY](https://drive.google.com/file/d/1XT1SZjRvQpRRw2-cCM4mwEebS4ahPZnY/view?usp=sharing)

## Thông tin sinh viên
- **Họ và tên:** Lại Xuân Biển
- **MSSV:** BIT240041
- **Trường:** Đại học CMC
- **Ngành:** Công nghệ thông tin

## Công nghệ sử dụng
- Java JDK 21
- Spring Boot 3.x
- Spring Web (RESTful API)
- Thymeleaf (Template Engine)
- Spring Boot DevTools

## Cách cài đặt và chạy project
1. Clone dự án về máy: `git clone <URL_GitHub_Của_Bạn>`
2. Mở thư mục dự án bằng **IntelliJ IDEA**.
3. Chờ Maven tải các thư viện cần thiết.
4. Chạy file `StudentManagementApplication.java`.
5. Mở trình duyệt web và truy cập `http://localhost:8080`.

## Danh sách chức năng hoàn thiện
- [x] **Bài 1:** Cấu hình thành công Spring Boot chạy trên port 8080.
- [x] **Bài 2:** API tĩnh trả về chuỗi String (`/home/index`, `/home/about`, `/home/contact`).
- [x] **Bài 3:** Nhận tham số động bằng `@PathVariable` (`/product/detail/5`) và `@RequestParam` (`/product/category?name=Laptop`). Xử lý ngoại lệ khi thiếu tham số.
- [x] **Bài 4:** Truyền object Model sang View sử dụng Thymeleaf (`/student/info`).
