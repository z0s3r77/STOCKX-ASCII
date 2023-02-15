package edu.craptocraft.stockx.criteria;


import org.junit.Test;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;



public class AndCriteriaTest {

    static Size size = new Size("9.5");
    static Sales sales = new Sales();

    static AndCriteria andSizeSales;

    @BeforeClass public static void onlyOnce(){

        andSizeSales = new AndCriteria(size, sales);
    }

    @Test public  void constructorTest(){

        assertNotNull(andSizeSales);
        assertTrue(andSizeSales instanceof Criteria);
    }


    @Test public void checkCriteriaTest(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Sale("6", 356));
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));
        

        assertEquals(2, andSizeSales.checkCriteria(sneaker).size());
    }




}
