package com.elfayq.inventairetv.inventairetvlaayoune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elfayq.inventairetv.inventairetvlaayoune.models.EquipementMake;

@Repository
public interface EquipementMakeRepository extends JpaRepository<EquipementMake, Integer> {

}
