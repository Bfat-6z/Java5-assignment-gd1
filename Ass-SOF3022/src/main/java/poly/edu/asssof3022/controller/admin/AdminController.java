package poly.edu.asssof3022.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.edu.asssof3022.entity.Product;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    // Trang chính (dashboard)
    @GetMapping("/panel")
    public String panel(Model model) {
        model.addAttribute("title", "Bảng điều khiển quản trị");
        return "admin/layout/main"; // Trả về layout chính
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        System.out.println("DEBUG Dashboard: Method HIT OK!");  // Log này PHẢI in nếu fix đúng
        model.addAttribute("title", "Bảng điều khiển Dashboard");
        return "admin/dashboard";  // Path templates/admin/dashboard.ht
    }

    // Trang danh sách sản phẩm
    @GetMapping("/products")
    public String showList(Model model) {
        List<Product> list = List.of(

                new Product(1, "Bánh mì", 10000.0, 50),
                new Product(2, "Sữa tươi", 15000.0, 20),
                new Product(3, "Trà sữa", 30000.0, 12)
        );
        model.addAttribute("list", list);
        model.addAttribute("title", "Danh sách sản phẩm");
        return "admin/product/list";  // Trả về view list.html
    }



}
