package com.example.CourseManagementRest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseManagementRest.Interface.Courserepo;
import com.example.CourseManagementRest.entity.Course;


@RestController
public class MyController {
	
	@Autowired
	Courserepo  repo;
	
	@GetMapping("/")
	public String home() {
		return "hello";
	    }

	@GetMapping("/courses")
	public List<Course> getCourse(){
		return repo.findAll();
	     }
	@RequestMapping("/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable("courseId") int courseId){
		return repo.findById(courseId);
	     }
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course courses){
		return repo.save(courses);
	   }
	@PutMapping(path="/courses",consumes= {"application/json"})
	public Course saveOrUpdateCourse(@RequestBody Course courses)
	{
		repo.save(courses);
		return courses;
	}
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable int courseId) 
	{
		Course a = repo.getOne(courseId);
		repo.delete( a);

		return "delete";
		
	}

	}

