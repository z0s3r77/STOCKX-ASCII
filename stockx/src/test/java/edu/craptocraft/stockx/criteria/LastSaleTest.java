package edu.craptocraft.stockx.criteria;

import org.junit.Test;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;


public class LastSaleTest  {
    
    static LastSale lastSale;

    @BeforeClass public static void onlyOnce(){

        lastSale = new LastSale();

    }

    @Test public void constructorTest(){

        assertNotNull(lastSale);
        assertTrue(lastSale instanceof Criteria);

    }

    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Sale sale = new Sale("6", 356);
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(sale);

        assertEquals(sale, lastSale.checkCriteria(sneaker).get(0));
        
    }



}
