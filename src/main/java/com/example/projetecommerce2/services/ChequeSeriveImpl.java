package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Cheque;
import com.example.projetecommerce2.repositories.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChequeSeriveImpl implements ChequeService {

    private ChequeRepository clientRepository;

    @Autowired
    public void ChequeServiceimpl (ChequeRepository chequeRepository) {
        this.chequetRepository = clientRepository;
    }

    @Override
    public Cheque saveCheque(Cheque cheque) {
        return chequeRepository.save(cheque);
    }

    @Override
    public Cheque updateCheque(Cheque cheque) {
        return chequeRepository.save(cheque);
    }

    @Override
    public void deleteChequeById(Long id) {
        ChequeRepository.deleteById(id);   }

    @Override
    public void deleteCheque() {

    }

    @Override
    public void deleteCheque) {

    }

    @Override
    public void deleteAllCheque() {
        chequeRepository.deleteAll();
    }

    @Override
    public Cheque getChequeById(Long id) {
        return chequeRepository.findById(id).get();
    }

    @Override
    public List<Cheque> getAllCheque) {
        return null;
    }

    @Override
    public List<Cheque> getAllCheque() {
        return chequeRepository.findAll();
    }

    @Override
    public List<Cheque> getAllCheques() {
        return null;
    }
}
