package com.anku.dao;

import java.util.List;

import com.anku.model.Student;

public interface StudentDao {
	String insert(Student student);

	String update(Student student);

	Student get(Integer sid);

	String delete(Integer sid);

	List<Student> getAll();
}
