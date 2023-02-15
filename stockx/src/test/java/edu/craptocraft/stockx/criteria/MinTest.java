package edu.craptocraft.stockx.criteria;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

public class MinTest {
    

    static Size size = new Size("9.5");
    static Asks bids = new Asks();

    static Min min;

    @BeforeClass public static void onlyOnce(){

        min = new Min(size, bids);

    }

    @Test public void constructorTest(){

        assertNotNull(min);
        assertTrue(min instanceof Criteria);

    }

    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        

        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

        Offer minAsk = min.checkCriteria(sneaker).get(0);

        assertEquals(333, minAsk.value());
    }



}
