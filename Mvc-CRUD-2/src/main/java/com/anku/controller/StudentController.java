package com.anku.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anku.model.Student;
import com.anku.service.StudentService;

@Controller
public class StudentController {
	private final String STATUS = "status";

	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/insert")
	public String add() {
		return "insert";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	@PostMapping("/add")
	public String insert(@ModelAttribute Student student, HttpServletRequest req) {
		String status = studentService.insert(student);
		req.setAttribute(STATUS, status);
		return "insert";
	}

	@PostMapping("/search")
	public String get(@RequestParam("sid") Integer sid, HttpServletRequest req) {
		Student student = studentService.get(sid);
		req.setAttribute("student", student);
		return "search";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam("sid") Integer sid, HttpServletRequest req) {
		String status = studentService.delete(sid);
		req.setAttribute(STATUS, status);
		return "delete";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute Student student, HttpServletRequest req) {
		String status = studentService.update(student);
		req.setAttribute(STATUS, status);
		return "update";
	}

	@GetMapping("/showAll")
	public String getAll(HttpServletRequest req) {
		List<Student> allStudent = studentService.getAll();
		req.setAttribute("students", allStudent);
		return "showAll";
	}

}
