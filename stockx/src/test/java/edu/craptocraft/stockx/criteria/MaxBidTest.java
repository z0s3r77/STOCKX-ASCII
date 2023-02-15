package edu.craptocraft.stockx.criteria;


import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;


public class MaxBidTest {
    
    static MaxBid maxBid;

    @BeforeClass public static void onlyOnce(){

        maxBid = new MaxBid();

    }

    @Test public void constructorTest(){

        assertNotNull(maxBid);
        assertTrue(maxBid instanceof Criteria);

    }

    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        List<Offer> maxBidList = new ArrayList<Offer>() ;

        maxBidList.add(new Bid("9.5", 480));

        assertEquals(maxBidList.get(0).value(), maxBid.checkCriteria(sneaker).get(0).value());

    }

}
