package edu.craptocraft.stockx.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;


public class BidTest {
    
    static Bid bid; 

    @BeforeClass public static void onlyOnce(){
        
        bid = new Bid("13", 550);
    
    }

    @Test public void constructorTest(){

        assertNotNull(bid);
    }

    @Test public void sizeTest(){
        assertEquals("13", bid.size());
    }

    @Test public void valueTest(){
        assertEquals(550, bid.value());
    }

    @Test public void compareToTest(){

        Bid bid2 = new Bid("20", 280);
        assertEquals(1, bid.compareTo(bid2));

        Bid bid3 = new Bid("13", 560);
        assertEquals(-1, bid.compareTo(bid3));

    }

    @Test public void toStringTest(){

        String result = "\t\t"+bid.size()+"\t"+bid.value()+"\n";
        assertEquals(result, bid.toString());

    }
}
