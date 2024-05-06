package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Cheque;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChequeService {
    Cheque saveCheque(Cheque cheque);
    Cheque  updateCheque(Cheque cheque);
    void deleteChequeById(Long id);
    void deleteCheque();

    void deleteAllCheque();

    Cheque  getChequeById(Long id);
    List<Cheque > getAllCheque();

    List<Cheque > getAllCheques();

}
