/*
 * in the controller java its contain all the varible,Repository object,java class,page link etc.
 */
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;


@Controller
@SessionAttributes({"id","prodname","price","qty"})



public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("showproduct")
	public String showproduct() {
		System.out.println("Inside the product filling list");
		return " productform";
	}
	@PostMapping("showproductlist")
	public String showproductlist(@RequestParam("id") String id,@RequestParam("prodname") String prodname,@RequestParam("price") String price,
			@RequestParam("qty") String qty,@ModelAttribute Product objprod,Model model ) {
		
		productRepository.save(objprod);
		
		return "message";
	}
	@GetMapping("showsearch")
	public String showProductSearchForm() {
		System.out.println("Inside showProductSearchForm");
		return "productsearch";
	}

	@PostMapping("showProductSearch")
	public String showProductSearch(@RequestParam("prodid") String prodid, @ModelAttribute Product pro, Model model) {
		System.out.println("Inside showProductSearch");

		Optional<Product> proOpt = productRepository.findById(Integer.parseInt(prodid));
		Product objprod = proOpt.get();
		System.out.println(objprod.getProdname() + objprod.getPrice() + objprod.getQty());

		String pname = objprod.getProdname();
		int pprice = objprod.getPrice();
		int pqty = objprod.getQty();

		model.addAttribute("prodid", prodid);
		model.addAttribute("pname", pname);
		model.addAttribute("pprice", pprice);
		model.addAttribute("pqty", pqty);
		return "productdisplay";
	}

	
}
