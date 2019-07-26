package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rvrsstrng;
    @Before
    public void setUp(){
        this.rvrsstrng = new ReverseString();
    }
    @Test
    public void givenStringinputAndShouldReverseString() {

        //act

        String actualresult =  this.rvrsstrng.reverseString("hello world");

        //assert

        assertEquals("dlrow olleh", actualresult);
    }
    @Test
    public void givenNullAsInputAndShouldReturnErroMessage() {

        //act

        String actualresult =  this.rvrsstrng.reverseString(null);

        //assert
        assertNotNull("Insert a String Null value not Null",actualresult);

    }
}