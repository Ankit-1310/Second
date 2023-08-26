package com.anku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anku.dao.StudentDao;
import com.anku.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public String insert(Student student) {
		return this.studentDao.insert(student);
	}

	@Override
	public String update(Student student) {
		return this.studentDao.update(student);
	}

	@Override
	public Student get(Integer sid) {
		return this.studentDao.get(sid);
	}

	@Override
	public String delete(Integer sid) {
		return this.studentDao.delete(sid);
	}

	@Override
	public List<Student> getAll() {
		return this.studentDao.getAll();
	}

}
