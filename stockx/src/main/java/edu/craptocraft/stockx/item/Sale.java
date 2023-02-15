package edu.craptocraft.stockx.item;

public class Sale implements Offer{

    private String size;
    private Integer price;

    public Sale(String size, Integer price){
        this.size = size;
        this.price = price;
    }



    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer oferta) {
        return this.price.compareTo(oferta.value());
    }

    @Override
    public String toString() {
        StringBuilder offer = new StringBuilder();
        offer.append("\t\t"+this.size()+"\t"+this.value()+"\n");
        return offer.toString();
    }
    
}
