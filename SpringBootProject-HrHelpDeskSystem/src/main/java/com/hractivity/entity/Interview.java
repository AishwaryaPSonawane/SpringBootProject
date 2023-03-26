package com.hractivity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="InterviewInformation")
@AllArgsConstructor
@NoArgsConstructor

@Data
@Builder

public class Interview {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "CandidateName", length = 30)
	private String name;
	@Column(name = "mobNo", length = 10)
	private Long mobNo;
	@Column(name = "email", length = 30)
	private String email;
	@Column(name = "college", length = 50)
	private String college;
	@Column(name = "qualification", length = 10)
	private String qualification;
	@Column(name = "date", length = 10)
	private String date;
	
}