package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Listedenvie;
import com.example.projetecommerce2.repositories.ListedenvieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListedenvieServiceImpl implements ListedenvieService{


    private ListedenvieRepository listedenvieRepository;

    @Autowired
    public ListedenvieServiceImpl (ListedenvieRepository listedenvieRepository) {
        this.listedenvieRepository = listedenvieRepository;
    }

    @Override
    public Listedenvie saveListedenvie(Listedenvie listedenvie) {
        return listedenvieRepository.save(listedenvie);
    }


    @Override
    public Listedenvie updateListedenvie(Listedenvie listedenvie) {
        return listedenvieRepository.save(listedenvie);
    }


    @Override
    public Listedenvie save(Listedenvie listedenvie) {
        return null;
    }


    @Override
    public void deleteListedenvieById(Long id) {
        listedenvieRepository.deleteById(id);   }


    @Override
    public void deleteAllListedenvie() {
        listedenvieRepository.deleteAll();
    }

    @Override
    public Listedenvie getListedenvieById(Long id) {
        return listedenvieRepository.findById(id).get();
    }


    @Override
    public List<Listedenvie> getAllListedenvie() {
        return listedenvieRepository.findAll();
    }
}
