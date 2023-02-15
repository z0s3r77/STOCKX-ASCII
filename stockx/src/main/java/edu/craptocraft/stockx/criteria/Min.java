package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Min implements Criteria {
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria){

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        Optional<Offer> minCriteria = this.criteria.checkCriteria(item).stream()
                                                                        .filter(offer -> this.otherCriteria.checkCriteria(item).contains(offer))
                                                                        .min(Offer::compareTo);

        return minCriteria.isPresent() ? List.of(minCriteria.get()) : List.of();


    }


}
