package com.example.projetecommerce2.services;
import com.example.projetecommerce2.entities.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PromotionService {
    Promotion savePromotion(Promotion promotion);
    Promotion updatePromotion(Promotion promotion);
    void deletePromotionById(Long id);
    void deleteAllPromotions();
    Promotion getPromotiontById(Long id);
    List<Promotion> getAllPromotions();
}
