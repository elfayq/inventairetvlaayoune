package com.elfayq.inventairetv.inventairetvlaayoune.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

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
public class EquipementMovement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="equipementid", insertable=false, updatable=false)
	private Equipement equipement;
	private int equipementid;
	
	@ManyToOne
	@JoinColumn(name="stateid1", insertable=false, updatable=false)
	private State state1;
	private int stateid1;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date date1;
	
	@ManyToOne
	@JoinColumn(name="stateid2", insertable=false, updatable=false)
	private State state2;
	private int stateid2;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")		
	private Date date2;

	private String remarks;
}
