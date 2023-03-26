package com.hractivity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hractivity.entity.Interview;

public interface InterviewRepository extends JpaRepository <Interview , Integer> {

}
