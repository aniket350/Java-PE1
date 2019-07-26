package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingnumberTest {
    Sortingnumber srtngnmbr;

    @Before
    public void setUp(){
        this.srtngnmbr = new Sortingnumber();
    }

    @Test
    public void givenInputNumberShouldReturnSortedNumber() {

        //act

        String actualresult =  this.srtngnmbr.sortNumber(246759);

        //assert

        assertEquals("Not greater than 25", actualresult);
    }

}