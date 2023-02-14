package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Bids implements Criteria{



    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> bids = item.offers().stream()
                                        .filter(offer -> offer instanceof Bid)
                                        .collect(Collectors.toList());

        return bids.isEmpty() ? List.of() : bids;

    }
    
    

}
