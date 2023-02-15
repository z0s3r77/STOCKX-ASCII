package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Size implements Criteria {

    private String sizeValue;

    public Size(String size){
        this.sizeValue = size;
    }

    public String getSize(){
        return this.sizeValue;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sizes = item.offers().stream()
                                        .filter(offer -> offer.size().equals(this.sizeValue))
                                        .collect(Collectors.toList());
        
        return sizes.isEmpty() ? List.of() : sizes;
                                            
    }
    
}
