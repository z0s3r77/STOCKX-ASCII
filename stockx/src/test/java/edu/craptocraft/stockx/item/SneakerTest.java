package edu.craptocraft.stockx.item;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;


public class SneakerTest {


    static Sneaker item;

    @BeforeClass public static void onlyOnce(){

        item = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

    }

    @Test public void constructorTest(){

        assertNotNull(item);
    }
    
    @Test public void toStringTest(){

        String result="\n\t"+item.getName()+"\n\t\t"+item.getStyle();

        assertEquals(result, item.toString());

    }

    @Test public void addTest(){

        item.add(new Bid("13", 550));
        item.add(new Bid("6", 200));
        item.add(new Bid("9.5", 479));
        item.add(new Bid("13", 338));
        item.add(new Bid("9.5", 480));

        assertEquals(5, item.offers().size());
        

    }


}
