package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatLastInputTest {

    RepeatLastInput rptlstinpt;

    @Before
    public void setup(){
        this.rptlstinpt = new RepeatLastInput();
    }
    @Test
    public void main() {
        //act

        String actualresult =  this.rptlstinpt.repeatLastInputNumberTimes("Aniket" , 3);

        //arrange

        assertEquals("aniketketketket", actualresult);
    }
}