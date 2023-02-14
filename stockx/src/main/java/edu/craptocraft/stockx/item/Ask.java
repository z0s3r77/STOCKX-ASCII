package edu.craptocraft.stockx.item;

public class Ask implements Offer {
    
    private String size;
    private Integer value;

    public Ask(String size, Integer value ){

        this.size = size;
        this.value = value;
    }

    public String size() {
        return this.size;
    }

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
