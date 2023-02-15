package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Max implements Criteria {


    private Criteria criteria;
    private Criteria otherCriteria;


    public Max(Criteria criteria, Criteria otherCriteria){

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        Optional<Offer> maxCriteria = this.criteria.checkCriteria(item).stream()
                                                                        .filter(offer -> this.otherCriteria.checkCriteria(item).contains(offer))
                                                                        .max(Offer::compareTo);
        
        return maxCriteria.isPresent() ? List.of(maxCriteria.get()) : List.of();
                                                                        
                


    }
    



}
