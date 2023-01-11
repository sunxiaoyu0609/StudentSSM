package com.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.edu.pojo.Course;
import com.edu.pojo.Student;

public interface StudentMapper {
	int addStudent(Student student);

    //根据id删除一个Student
    int deleteStudentById(@Param("sid") int id);

    //更新Student
    int updateStudent(Student student);

    //根据id查询,返回一个Student
    Student queryStudentById(@Param("sid") int id);

    //查询全部Student,返回list集合
    List<Student> queryAllStudent();
    
    //查询所有课程
    @Select("select * from student")
	@Results({@Result(column = "sid",property = "sid"),
		@Result(property = "courses",column = "sid",
		many=@Many(fetchType = FetchType.LAZY,
		select = "com.edu.dao.CourseMapper.findAllcoursesBySid"))})
	List<Student> findAllStudentAndCourse();
}
