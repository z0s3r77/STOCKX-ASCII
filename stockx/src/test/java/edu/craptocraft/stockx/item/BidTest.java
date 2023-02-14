package edu.craptocraft.stockx.item;

import org.junit.Test;

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

}
