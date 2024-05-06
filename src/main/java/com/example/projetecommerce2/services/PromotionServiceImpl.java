package com.example.projetecommerce2.services;

import com.example.projetecommerce2.entities.Promotion;
import com.example.projetecommerce2.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromotionServiceImpl implements PromotionService
{

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
    public void deleteAllPromotions() {
        
    }

    @Override
    public Promotion getPromotiontById(Long id) {
        return null;
    }

    @Override
    public List<Promotion> getAllPromotions() {
        return null;
    }


}
