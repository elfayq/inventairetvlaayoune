package com.elfayq.inventairetv.inventairetvlaayoune.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fonction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String  fonction_name;
	
	
	@ManyToOne
	@JoinColumn(name="serviceid", insertable=false, updatable=false)
	private Seervice service;
	private Integer serviceid;

}
