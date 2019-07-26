package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class evenoddTest {
    EvenOdd evnodd;

    @Before
    public void setUp(){
        System.out.println("Inside Before");
        this.evnodd = new EvenOdd();
    }

    @Test
    public void givenInputAndcheckEvenOdd() {

        //act

        String actualresult =  this.evnodd.checkEvenOdd(20);

        //assert

        assertEquals("Jerry", actualresult);
    }
}