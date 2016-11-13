package com.gusoracing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Categories {
	
	private String name;
	//private String id;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@RequestMapping(value = "/GetCategories", method = RequestMethod.GET, produces = "application/json")	
	public @ResponseBody Categories getCategories(){
		Categories cat = new Categories();
		cat.setName("Categoriaaaa 1");
		
		//this.id = "ID 1";
		return cat;
		
	}
	

}
