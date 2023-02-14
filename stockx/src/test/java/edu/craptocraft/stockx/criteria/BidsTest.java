package edu.craptocraft.stockx.criteria;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;


import org.junit.BeforeClass;


public class BidsTest {
    
    static Bids bids;

    @BeforeClass public static void onlyOnce(){

        bids = new Bids();
    }


    @Test public void constructorTest(){

        assertNotNull(bids);

    }


}
