package com.edu.pojo;

public class Course {
	private int cid;
	private String coursename;
	private String cteacher;
	private int sid;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCteacher() {
		return cteacher;
	}
	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + ", cteacher=" + cteacher + "]";
	}
	
}
