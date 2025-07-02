package com.LPU.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class StudentController {
	private List<Student> students = new ArrayList<>();
	private AtomicLong idCounter = new AtomicLong(1);
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		student.setsRollNo(idCounter.getAndIncrement());
		students.add(student);
		return student;
	}
	
	@GetMapping
	public List<Student> getAllStudents() {
		return students;
	}

	// Get student by ID
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable long id) {
		for (Student student : students) {
			if (student.getsRollNo() == id) {
				return student;
			}
		}
		throw new RuntimeException("Student not found with id: " + id);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student updatedStudent) {
		for (Student student : students) {
			if (student.getsRollNo() == id) {
				student.setsName(updatedStudent.getsName());
				student.setsEmail(updatedStudent.getsEmail());
				return student;
			}
		}
		throw new RuntimeException("Student not found with id: " + id);
	}
	
	@DeleteMapping("/{id}")
	public Student deleteStudent(@PathVariable long id) {
		for (Student student : students) {
			if (student.getsRollNo() == id) {
				students.remove(student);
				return student;
			}
		}
		throw new RuntimeException("Student not found with id: " + id);
	}


	
}