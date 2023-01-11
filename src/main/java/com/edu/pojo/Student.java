package com.edu.pojo;

import java.util.List;



public class Student {
	private int sid;
	private String sname;
	private int sage;
	private Course courses;
	
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Student(int sid, String sname, int sage) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	public Student() {

	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", courses=" + courses + "]";
	}

}
