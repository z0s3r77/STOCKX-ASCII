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
        return this.value.compareTo(oferta.value());
    }
    
    @Override
    public String toString() {
        StringBuilder offer = new StringBuilder();
        offer.append("\t\t"+this.size()+"\t"+this.value()+"\n");
        return offer.toString();
    }
}
