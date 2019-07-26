package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    palindrome palind;

    @Before
    public void setUp(){
       this.palind = new palindrome();
    }

    @Test
    public void givenInputNumberShouldCheckWetherPalindrome() {

        //act

        String actualresult =  this.palind.checkPalindrome(123454321);

        //assert

        assertEquals("Not greater than 25", actualresult);
    }
}