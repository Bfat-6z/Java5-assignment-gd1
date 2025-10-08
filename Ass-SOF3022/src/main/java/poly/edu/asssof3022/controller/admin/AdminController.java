package poly.edu.asssof3022.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.edu.asssof3022.entity.Product;

import java.util.*;

@Controller
public class AdminController {
    @RequestMapping("/admin/panel")
    public String panel(Model model) {
        return "admin/layout/main";
    }

    @RequestMapping("/admin/products")
    public String showList(Model model) {
        List<Product> list = List.of(
                new Product(1, "Bánh mì", 10000.0, 50),
                new Product(2, "Sữa tươi", 15000.0, 20)
        );
        model.addAttribute("list", list);
        model.addAttribute("title", "Danh sách sản phẩm");
        return "admin/product/list";
    }
}

