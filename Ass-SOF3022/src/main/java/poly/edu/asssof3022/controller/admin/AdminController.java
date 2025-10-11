package poly.edu.asssof3022.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("totalProducts", 125);
        model.addAttribute("totalCustomers", 56);
        model.addAttribute("revenue", 34000000);

        model.addAttribute("activeMenu", "dashboard");
        return "admin/dashboard";
    }

    @RequestMapping("/admin/products")
    public String products(Model model)
    {
        model.addAttribute("activeMenu", "products");
        return "admin/products";
    }
}
