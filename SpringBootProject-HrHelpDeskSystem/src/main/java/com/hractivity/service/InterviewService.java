package com.hractivity.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hractivity.entity.Interview;


@Component
public interface InterviewService {

	List<Interview> getAllInterview();

	Interview createInterview(Interview interview);

	Interview updateInterview(Interview interview, int id);

	Interview getInterviewById(int id);
	
	void deleteInterviewById(Integer id);

	
	
	
	
	
	
}
