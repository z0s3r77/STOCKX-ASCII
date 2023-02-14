package edu.craptocraft.stockx.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;


public class AskTest {
    

    static Ask ask;

    @BeforeClass public static void onlyOnce(){

        ask = new Ask("13",288);

    }

    @Test public void constructorTest(){

        assertNotNull(ask);
    }

    
    @Test public void sizeTest(){
        assertEquals("13", ask.size());
    }

    @Test public void valueTest(){
        assertEquals(288, ask.value());
    }


    @Test public void compareToTest(){

        Ask ask2 = new Ask("20", 280);
        assertEquals(1, ask.compareTo(ask2));

        Ask ask3 = new Ask("13", 290);
        assertEquals(-1, ask.compareTo(ask3));

    }

}
