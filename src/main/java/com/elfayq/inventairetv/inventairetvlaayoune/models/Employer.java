package com.elfayq.inventairetv.inventairetvlaayoune.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employer{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String employer_fname;
	private String employer_lname;
	private String employer_phone;
	private String employer_email;
	
	
	@ManyToOne
	@JoinColumn(name="cityid", insertable=false, updatable=false)
	private City city;
	private Integer cityid;
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false)
	private State state;
	private Integer stateid;
	

}
