package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Listedenvie;
import com.example.projetecommerce2.entities.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ListedenvieService {
    Listedenvie save(Listedenvie listedenvie);

    Listedenvie saveListedenvie(Listedenvie listedenvie);

    Listedenvie updateListedenvie(Listedenvie listedenvie);
    void deleteListedenvieById(Long id);
    void deleteAllListedenvie();
    Listedenvie getListedenvieById(Long id);
    List<Listedenvie> getAllListedenvie();

}
