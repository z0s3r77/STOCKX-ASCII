package edu.craptocraft.stockx.criteria;


import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

public class MaxTest {
    
    static Size size = new Size("9.5");
    static Bids bids = new Bids();

    static Max max;

    @BeforeClass public static void onlyOnce(){

        max = new Max(size, bids);

    }

    @Test public void constructorTest(){

        assertNotNull(max);
        assertTrue(max instanceof Criteria);

    }

    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        
        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        Offer MaxBid = max.checkCriteria(sneaker).get(0);

        assertEquals(480, MaxBid.value());
    }


}
