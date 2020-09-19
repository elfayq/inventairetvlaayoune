package com.elfayq.inventairetv.inventairetvlaayoune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementType;

@Repository
public interface EquipementTypeRepository extends JpaRepository<EquipementType, Integer> {

}
