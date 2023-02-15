package edu.craptocraft.stockx.criteria;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;

public class SalesTest {

    static Sales sales ;

    @BeforeClass public static void onlyOnce(){

        sales = new Sales();

    }

    @Test public void constructorTest(){

        assertNotNull(sales);
        assertTrue(sales instanceof Criteria);

    }


    @Test public void checkCriteriaTest(){
        
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));
        sneaker.add(new Ask("13", 330));
        sneaker.add(new Bid("13", 338));


        List<Offer> salesList = new ArrayList<Offer>();

        salesList.add(new Sale("9.5", 352));
        salesList.add(new Sale("9.5", 404));
        salesList.add(new Sale("13", 360));
        salesList.add(new Sale("13", 372));

        assertEquals(salesList.size(), sales.checkCriteria(sneaker).size());




    }

}
