package com.example.CourseManagementRest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	 int courseId;
	 String courseName;
	 String courseDesription;
	 int courseFee;
	 String courseDuration;
	public Course(int courseId, String courseName, String courseDesription, int courseFee, String courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesription = courseDesription;
		this.courseFee = courseFee;
		this.courseDuration = courseDuration;
	}
	public Course() {
		super();
	
}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesription() {
		return courseDesription;
	}
	public void setCourseDesription(String courseDesription) {
		this.courseDesription = courseDesription;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
}