package edu.craptocraft.stockx.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;


public class SaleTest {

    static Sale sale;
    
    @BeforeClass public static void onlyOnce(){

        sale = new Sale("6",356);

    }


    @Test public void constructorTest(){

        assertNotNull(sale);
        assertTrue(sale instanceof Offer);

    }


    @Test public void sizeTest(){
        assertEquals("6", sale.size());
    }

    @Test public void valueTest(){

        assertEquals(356, sale.value());

    }

    @Test public void compareToTest(){

        Sale sale2 = new Sale("8",330);
        assertEquals(1, sale.compareTo(sale2));

    }

}
