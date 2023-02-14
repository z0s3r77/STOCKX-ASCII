package edu.craptocraft.stockx.item;


import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    
    private String style;
    private String name;
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAsk() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getSale() {
        // TODO Auto-generated method stub
        return 0;
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAsk(int ask) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSale(int sale) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {

        StringBuilder snaker = new StringBuilder();

        snaker.append("\n\t"+this.getName());
        snaker.append("\n\t\t"+this.getStyle());

        return snaker.toString();
    }
}
