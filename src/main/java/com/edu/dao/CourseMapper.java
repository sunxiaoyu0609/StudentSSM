package com.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.edu.pojo.Course;


public interface CourseMapper {
	@Select("select * from course where sid=#{sid}")
	List<Course> findAllcoursesBySid();
}
