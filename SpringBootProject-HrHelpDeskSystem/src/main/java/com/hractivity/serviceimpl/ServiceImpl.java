package com.hractivity.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hractivity.entity.Interview;
import com.hractivity.repository.InterviewRepository;
import com.hractivity.service.InterviewService;

@Service
public class ServiceImpl implements InterviewService {
	@Autowired
	private InterviewRepository interviewrepository;
	
	@Override
	public List<Interview> getAllInterview() {
		// TODO Auto-generated method stub
		return interviewrepository.findAll();
	}	
	
	@Override
	public Interview createInterview(Interview interview) {
		// TODO Auto-generated method stub
		return interviewrepository.save(interview);
	}

	@Override
	public Interview updateInterview(Interview interview, int id) {
		// TODO Auto-generated method stub
		Interview _interview = interviewrepository.findById(id).get();
		_interview.setDate(interview.getDate());
		return interviewrepository.save(_interview);
	}

	@Override
	public Interview getInterviewById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void deleteInterviewById(Integer id) 
	{
		interviewrepository.deleteById(id);
		//System.out.println( "The information is deleted");	
	}
}
