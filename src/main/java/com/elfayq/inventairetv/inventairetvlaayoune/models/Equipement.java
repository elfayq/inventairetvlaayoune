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
public class Equipement {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	private String equipNom;	
	
	private String equipReference;
	
	private String equipNumSerie;
	
	private String equipInventaire;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DateAffectLaayoune;
	
	private String observation;
	
	@ManyToOne
	@JoinColumn(name="equipementtypeid", insertable=false, updatable=false)
	private EquipementType equipementType;
	private Integer equipementtypeid;
	
	@ManyToOne
	@JoinColumn(name="equipementmakeid", insertable=false, updatable=false)
	private EquipementMake equipementMake;
	private Integer equipementmakeid;
	
	


	
}
