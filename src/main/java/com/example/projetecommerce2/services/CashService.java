package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Cash;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CashService {


        Cash saveCash(Cash cash);
        Cash updateCash(Cash cash);
        void deleteCashById(Long id);
        void deleteCash();

        void deleteAllCash();

        Cash  getCashById(Long id);

        void deleteAllCashs();

        Cash getCashtById(Long id);

        List<Cash> getAllCash();

        List<Cash> getAllCashs();
    }
