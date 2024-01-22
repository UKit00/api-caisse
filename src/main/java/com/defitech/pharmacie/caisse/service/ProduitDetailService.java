package com.defitech.pharmacie.caisse.service;

import com.defitech.pharmacie.caisse.entity.ProduitDetail;
import com.defitech.pharmacie.caisse.repository.ProduitDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitDetailService {

    @Autowired
    ProduitDetailRepository produitDetailRepository;

    public void ajouter(ProduitDetail pd){
        produitDetailRepository.save(pd);
    }

}
