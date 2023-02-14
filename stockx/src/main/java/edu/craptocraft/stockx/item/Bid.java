package edu.craptocraft.stockx.item;

public class Bid implements Offer {

    private String size;
    private Integer bid;

    public Bid(String size, Integer bid){

        this.bid = bid;
        this.size = size;

    }

    @Override
    public String size() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(Offer oferta) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
