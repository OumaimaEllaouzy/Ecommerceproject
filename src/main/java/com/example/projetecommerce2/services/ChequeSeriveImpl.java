package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Cheque;
import com.example.projetecommerce2.repositories.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChequeSeriveImpl implements ChequeService {

    private ChequeRepository chequetRepository;

    @Autowired
    public void ChequeServiceimpl (ChequeRepository chequeRepository) {
        this.chequetRepository = chequetRepository;
    }

    @Override
    public Cheque saveCheque(Cheque cheque) {
        return chequetRepository.save(cheque);
    }

    @Override
    public Cheque updateCheque(Cheque cheque) {
        return chequetRepository.save(cheque);
    }

    @Override
    public void deleteChequeById(Long id) {
        chequetRepository.deleteById(id);   }

    @Override
    public void deleteCheque() {

    }



    @Override
    public void deleteAllCheque() {
        chequetRepository.deleteAll();
    }

    @Override
    public Cheque getChequeById(Long id) {
        return chequetRepository.findById(id).get();
    }


    @Override
    public List<Cheque> getAllCheque() {
        return chequetRepository.findAll();
    }

    @Override
    public List<Cheque> getAllCheques() {
        return null;
    }
}
