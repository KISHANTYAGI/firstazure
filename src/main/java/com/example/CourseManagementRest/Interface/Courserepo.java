package com.example.CourseManagementRest.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.CourseManagementRest.entity.Course;

@Repository
public interface Courserepo extends JpaRepository<Course,Integer>{
	Course getOne(int courseId);
}
