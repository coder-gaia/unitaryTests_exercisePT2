package br.com.alexandreG.testing;


import org.junit.Assert;
import org.junit.Test;

public class JUnitFirstTestsTest {

    @Test
    public void firstTest(){
        String name = "Alexandre";
        Assert.assertEquals("Alexandre", name);
    }

    @Test
    public void secondTest(){
        String name = "top";
        Assert.assertNotEquals("topzera", name);
    }

}