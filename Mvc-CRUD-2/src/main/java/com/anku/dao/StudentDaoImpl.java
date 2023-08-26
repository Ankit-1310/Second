package com.anku.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.anku.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public String insert(Student student) {
		try {
			Student student2 = get(student.getSid());
			if (student2 != null) {

				return "Already Exist";
			} else
				hibernateTemplate.save(student);
			return "success";
		} catch (Exception e) {
			System.out.println(e);
			return "something went wrong";
		}

	}

	@Override
	@Transactional
	public String update(Student student) {
		try {
			Student sid = get(student.getSid());
			if (sid != null) {
				hibernateTemplate.merge(student);;
				return "Updated...!";

			} else {
				return "Student Not Exist...!";
			}
		} catch (Exception e) {
			System.out.println(e);
			return "something went wrong";
		}
	}

	@Override
	public Student get(Integer sid) {
		try {
			return hibernateTemplate.get(Student.class, sid);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	@Transactional
	public String delete(Integer sid) {
		try {
			Student st = get(sid);
			if (st != null) {
				hibernateTemplate.delete(st);
				return "Deleted...!";
			} else {
				return "Student Not Exist...!";

			}
		} catch (Exception e) {
			return "something went wrong";
		}
	}

	@Override
	public List<Student> getAll() {
		try {
			return hibernateTemplate.loadAll(Student.class);
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}
	}

}
