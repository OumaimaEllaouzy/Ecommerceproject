package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Promotion;
import com.example.projetecommerce2.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromotionServiceImpl {

    private PromotionRepository promotionRepository;

    @Autowired
    public void PromotionerviceImpl (PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    @Override
    public Promotion savePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }


    @Override
    public Promotion  updatePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }


    @Override
    public void deletePromotionById(Long id) {
        promotionRepository.deleteById(id);   }


    @Override
    public void deleteAllPromotion () {
        promotionRepository.deleteAll();
    }

    @Override
    public Promotion  getPromotionById(Long id) {
        return promotionRepository.findById(id).get();
    }


     @Override
    public List<Promotion > getAllpromotions() {
        return promotionRepository.findAll();
    }
}
