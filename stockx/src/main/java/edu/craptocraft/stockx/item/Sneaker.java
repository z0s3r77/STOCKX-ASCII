package edu.craptocraft.stockx.item;


import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    
    private String style;
    private String name;
    private int sale;
    private int bid;
    private int ask;

    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name){
        
        this.name = name;
        this.style = style;
    
    }


    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void add(Offer oferta) {
        this.offers.add(oferta);
        
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        
        this.ask = ask;
    
    }

    @Override
    public void setSale(int sale) {

        this.sale = sale;
    }

    @Override
    public String toString() {

        StringBuilder snaker = new StringBuilder();

        snaker.append("\n\t"+this.getName());
        snaker.append("\n\t\t"+this.getStyle());

        return snaker.toString();
    }
}
