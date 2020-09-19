package com.elfayq.inventairetv.inventairetvlaayoune.models;


import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipementAffectation {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="equipementid", insertable=false, updatable=false)
	private Equipement equipement;
	private Integer equipementid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date dateOut;
	
	private String timeOut;
	

	@ManyToOne
	@JoinColumn(name="employerid", insertable=false, updatable=false)
	private Employer employer;
	private Integer employerid;
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false)
	private State state;
	private Integer stateid;
	

	private String remarks;
}
