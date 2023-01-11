package com.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.dao.StudentMapper;
import com.edu.pojo.Course;
import com.edu.pojo.Student;
@Service
public class StudentServiceImpl implements StudentService {
	private StudentMapper studentMapper;
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public int addStudent(Student student) {
		return studentMapper.addStudent(student);
	}

	public int deleteStudentById(int id) {
		return studentMapper.deleteStudentById(id);
	}

	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}

	public Student queryStudentById(int id) {
		return studentMapper.queryStudentById(id);
	}

	public List<Student> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}

	public List<Student> findAllStudentAndCourse() {
		return studentMapper.findAllStudentAndCourse();
	}
}
