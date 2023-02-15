package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        Optional<Offer> lastSale = item.offers().stream()
                                            .filter(offer -> offer instanceof Sale)
                                            .reduce((first, second)-> second);

        return lastSale.isPresent() ? List.of(lastSale.get()) : List.of();
    }
    




}
