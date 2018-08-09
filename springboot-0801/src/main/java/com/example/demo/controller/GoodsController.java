package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/index")
	public String selectAll(Model model) {
		List<Goods> list=goodsService.selectAll();
		model.addAttribute("list", list);
		return "index.html";
	}
}
