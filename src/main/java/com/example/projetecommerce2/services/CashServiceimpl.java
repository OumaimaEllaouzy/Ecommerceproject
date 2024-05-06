package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Cash;
import com.example.projetecommerce2.repositories.CashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CashServiceimpl implements CashService {

    private final CashRepository CashRepository;
    private CashRepository cashRepository;

    @Autowired
    public CashServiceimpl(CashRepository cashRepository) {
        this.CashRepository = cashRepository;
    }

    @Override
    public Cash saveCash(Cash cash) {
        return cashRepository.save(cash);
    }

    @Override
    public Cash updateCash(Cash cash) {
        return cashRepository.save(cash);
    }

    @Override
    public void deleteCashById(Long id) {
        cashRepository.deleteById(id);   }

    @Override
    public void deleteCash() {

    }

    @Override
    public void deleteAllCash() {

    }

    @Override
    public Cash getCashById(Long id) {
        return null;
    }

    @Override
    public void deleteAllCashs() {
        cashRepository.deleteAll();
    }

    @Override
    public Cash getCashtById(Long id) {
        return cashRepository.findById(id).get();
    }

    @Override
    public List<Cash> getAllCash() {
        return null;
    }

    @Override
    public List<Cash> getAllCashs() {
        return cashRepository.findAll();
    }
}
