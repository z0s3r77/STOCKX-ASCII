package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class SizeTest {
    

    static Size size;

    @BeforeClass public static void onlyOnce(){

        size = new Size("9.5");

    }

    @Test public void constructorTest(){

        assertNotNull(size);
        assertTrue(size instanceof Criteria);

    }

    @Test public void getSize(){

        assertEquals("9.5", size.getSize());

    }

    @Test public void checkCriteriaTest(){

        
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Bid bid = new Bid("9.5", 480);
        Ask ask1 = new Ask("9.5", 333);
        Ask ask2 = new Ask("9.5", 340);
        Sale sale = new Sale("9.5", 352);

        sneaker.add(bid);
        sneaker.add(ask1);
        sneaker.add(ask2);
        sneaker.add(sale);

        List<Offer> sizeList = new ArrayList<Offer>();
        
        sizeList.add(bid);
        sizeList.add(ask1);
        sizeList.add(ask2);
        sizeList.add(sale);
        
        assertEquals(sizeList.size(), size.checkCriteria(sneaker).size());
        assertEquals(sizeList.get(1), size.checkCriteria(sneaker).get(1));

    }


}
