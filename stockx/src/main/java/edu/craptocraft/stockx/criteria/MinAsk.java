package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        

        Optional<Offer> minAsk = item.offers().stream()
                                                .filter(offer -> offer instanceof Ask)
                                                .min(Offer::compareTo);

        return minAsk.isPresent() ? List.of(minAsk.get()) : List.of();

    }
    
}
