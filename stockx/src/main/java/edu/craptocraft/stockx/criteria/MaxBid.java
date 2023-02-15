package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;


import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {

        Optional<Offer> maxBid = item.offers().stream()
                                            .filter(offer -> offer instanceof Bid)
                                            .max(Offer::compareTo);

        return maxBid.isPresent() ? List.of(maxBid.get()) : List.of();
    }
    
    

}
