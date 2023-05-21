package com.ankit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ankit.model.Student;
@Controller
public class ComplexController {
	@RequestMapping("/complex")
	public String showForm() {
		return"complex_form";
	}
	@RequestMapping(path="/handelform" ,method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute("student") Student student,BindingResult result) {
		 if(result.hasErrors()) {
			 return "complex_form";
		 }
		System.out.println(student);
		System.out.println(student.getAddress());
		
		return "success";
	}
}
