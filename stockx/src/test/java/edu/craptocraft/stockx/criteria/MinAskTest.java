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

public class MinAskTest {
    

    static MinAsk minAsk;

    @BeforeClass public static void onlyOnce(){
        minAsk = new MinAsk();
    }

    @Test public void constructorTest(){

        assertNotNull(minAsk);
        assertTrue(minAsk instanceof Criteria);

    }

    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

        List<Offer> minAskList = new ArrayList<Offer>();

        minAskList.add(new Ask("13", 330));

        assertEquals(minAskList.get(0).value(), minAsk.checkCriteria(sneaker).get(0).value());


    }

}
