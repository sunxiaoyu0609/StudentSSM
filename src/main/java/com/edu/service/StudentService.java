package com.edu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.edu.pojo.Course;
import com.edu.pojo.Student;

public interface StudentService {
	int addStudent(Student student);

    //根据id删除一个Student
    int deleteStudentById(int id);

    //更新Student
    int updateStudent(Student student);

    //根据id查询,返回一个Student
    Student queryStudentById(int id);

    //查询全部Student,返回list集合
    List<Student> queryAllStudent();
    
    //查询所有课程
    List<Student> findAllStudentAndCourse();
}
