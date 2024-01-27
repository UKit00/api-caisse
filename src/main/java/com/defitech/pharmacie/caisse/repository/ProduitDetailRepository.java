package com.defitech.pharmacie.caisse.repository;

import com.defitech.pharmacie.core.entity.ProduitDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDetailRepository extends JpaRepository<ProduitDetail, Integer> {
}
