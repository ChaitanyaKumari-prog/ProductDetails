package com.nareshit.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.entity.ProductEntity;
import com.nareshit.model.Product_details;
import com.nareshit.repository.ProductRepo;

@Controller
public class ProductController {
	@Autowired
	private ProductRepo repo;

	@GetMapping("/")
	public String addProduct(Model model) {
		Product_details product=new Product_details();
		model.addAttribute("product",product);
		return "add_product";
	}
	
	@PostMapping("/saveProduct")
	public String saveProducts(Product_details product) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(product,entity);
        repo.save(entity);
		return "redirect:/showProduct";
	}
	
	@RequestMapping("/showProduct")
	public String showProduct(Model model) {
		List<ProductEntity> products=repo.findAll();
		model.addAttribute("allproducts",products);
		return "show_product";
	}
}
