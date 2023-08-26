package com.anku.service;

import java.util.List;

import com.anku.model.Student;

public interface StudentService {
	String insert(Student student);

	String update(Student student);

	Student get(Integer sid);

	String delete(Integer sid);

	List<Student> getAll();
}
