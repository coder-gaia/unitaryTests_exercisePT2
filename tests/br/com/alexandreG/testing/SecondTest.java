/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.testing;

import org.junit.Assert;
import org.junit.Test;

public class SecondTest {

    @Test
    public void extraTest(){
        String name = "Alexandre";
        Assert.assertEquals("Alexandre", name);
    }
}
