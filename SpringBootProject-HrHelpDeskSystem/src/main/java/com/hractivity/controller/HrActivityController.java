package com.hractivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hractivity.entity.Interview;
import com.hractivity.service.InterviewService;


@RestController
@RequestMapping("/hr")
public class HrActivityController {

	@Autowired
	private InterviewService interviewservice;

	@GetMapping("/hello")
	String print() {
		return "<u>Hello</u>";

	}
	
	@GetMapping("/interviews")
	public List<Interview> fetchAllInterview() {
		return interviewservice.getAllInterview();

	}

	@PostMapping("/interview")
	public Interview newInterview(@RequestBody Interview interview) {
		return interviewservice.createInterview(interview);
	}
	
	@PutMapping(value = "/interview/{id}")
	public Interview updateAnInterview(@PathVariable int id, @RequestBody Interview interview) {
		return interviewservice.updateInterview(interview, id);
	}
	
	@DeleteMapping(value = "/interv/{id}")
	public void deleteInterview(@PathVariable Integer id) {
		interviewservice.deleteInterviewById(id);
	}
}
