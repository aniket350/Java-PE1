package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthiterationTest {

    Nthiteration nthitrton;

    @Before
    public void setUp(){
        this.nthitrton = new Nthiteration();
    }

    @Test
    public void givenInputInNthFormAndRepeatNthTime() {

        //act

        int actualresult =  this.nthitrton.repeatNthTime(4);

        //assert

        assertEquals(1223334444, actualresult);
    }
}