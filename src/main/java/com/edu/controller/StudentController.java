package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.pojo.Course;
import com.edu.pojo.Student;
import com.edu.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	@Qualifier("StudentServiceImpl")
	private StudentService studentservice;
	
	 @RequestMapping("/allStudent")
	    public String list(Model model) {
	        List<Student> list = studentservice.queryAllStudent();
	        model.addAttribute("list", list);
	        return "allStudent";
	    }
	 @RequestMapping("/toAddStudent")
	    public String toAddStudent() {
	        return "addStudent";
	    }
	 @RequestMapping("/addStudent")
	    public String addStudent(Student student) {
	        System.out.println(student);
	        studentservice.addStudent(student);
	        return "redirect:/student/allStudent";
	    }
	 @RequestMapping("/toUpdateStudent")
	    public String toUpdateStudent(Model model, int id) {
		 	Student student = studentservice.queryStudentById(id);
	        System.out.println(student);
	        model.addAttribute("student",student );
	        return "updateStudent";
	    }
	 @RequestMapping("/updateStudent")
	    public String updateStudent(Model model,Student students) {
	        System.out.println(students);
	        studentservice.updateStudent(students);
	        Student student = studentservice.queryStudentById(students.getSid());
	        model.addAttribute("student", student);
	        return "redirect:/student/allStudent";
	    }
	 @RequestMapping("/del/{sid}")
	    public String deleteStudent(@PathVariable("sid") int id) {
		 	studentservice.deleteStudentById(id);
	        return "redirect:/student/allStudent";
	    }
	 @RequestMapping("/allStudentCourse")
	 public String finAllStudentCourse(Model model) {
		 	List<Student> list=studentservice.findAllStudentAndCourse();
		 	for(Student student:list) {
		 		System.out.println(student);
		 	}
		 	model.addAttribute("list", list);
	        return "StudentCourse";
	   }
	 
}
