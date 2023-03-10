package edu.craptocraft.stockx.criteria;


import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;


public class AsksTest {
    
    static Asks ask;

    @BeforeClass public static void onlyOnce(){

        ask = new Asks();
    }

    @Test public void constructorTest(){

        assertNotNull(ask);
        assertTrue(ask instanceof Criteria);


    }
    
    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

        List<Offer> asks = new ArrayList<>();
        asks.add(new Ask("6", 600));
        asks.add(new Ask("9.5", 333));
        asks.add(new Ask("9.5", 340));
        asks.add(new Ask("13", 330));

        assertEquals(asks.size(), ask.checkCriteria(sneaker).size());
        

    }


}
