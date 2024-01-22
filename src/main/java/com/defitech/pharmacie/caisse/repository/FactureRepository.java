package com.defitech.pharmacie.caisse.repository;

import com.defitech.pharmacie.caisse.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Integer> {

}
