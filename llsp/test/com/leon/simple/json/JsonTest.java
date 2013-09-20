
package com.leon.simple.json;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import com.leon.generator.Compile;
import com.leon.simple.calc.Token;

/**
 * @author : Leon
 * @since : 2013-9-18
 * @see :
 */

public class JsonTest {
    
    @Test
    public void testCalc() throws Exception {
        Compile scg = new Compile();
        Json o = (Json) scg.ast(new File("test/com/leon/simple/json/json.g"), new File("test/com/leon/simple/json/example_json.js"), JsonToken.class);
    }
}