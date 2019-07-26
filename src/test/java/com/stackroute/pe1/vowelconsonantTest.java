package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vowelconsonantTest {

    vowelconsonant vowlconso;

    @Before
    public void setUp(){
        System.out.println("Inside Before");
        this.vowlconso = new vowelconsonant();
    }

    @Test
    public void givenCharacterInputAndCheckAsVowel() {
        //act

        String actualresult =  this.vowlconso.checkVowelOrConsonant("a");

        //assert

        assertEquals("It is a vowel", actualresult);
    }
    @Test
    public void givenCharacterInputAndCheckAsConsonant() {
        //act

        String actualresult =  this.vowlconso.checkVowelOrConsonant("z");

        //assert

        assertEquals("It is a Consonent", actualresult);
    }
}