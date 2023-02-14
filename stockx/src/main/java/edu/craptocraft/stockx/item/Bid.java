package edu.craptocraft.stockx.item;

public class Bid implements Offer {

    private String size;
    private Integer value;

    public Bid(String size, Integer bid){

        this.value = bid;
        this.size = size;

    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public int compareTo(Offer oferta) {
        return this.compareTo(oferta);
    }
    
}
