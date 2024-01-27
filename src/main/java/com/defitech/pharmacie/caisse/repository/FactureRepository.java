package com.defitech.pharmacie.caisse.repository;

import com.defitech.pharmacie.core.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer> {

}
