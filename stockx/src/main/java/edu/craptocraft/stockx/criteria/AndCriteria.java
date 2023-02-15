package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;

    }


    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> result = this.criteria.checkCriteria(item).stream()
                                                                .filter(offer -> this.otherCriteria.checkCriteria(item).contains(offer))
                                                                .collect(Collectors.toList());

        return result.isEmpty() ? List.of() : result;

    }
    
}
