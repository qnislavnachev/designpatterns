package com.clouway.test.task1;

import com.clouway.task1.Codec;
import com.clouway.task1.JSONCodec;
import com.clouway.task1.ReflectionCodecFactory;
import com.clouway.task1.XMLCodec;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class ReflectionCodecFactoryTest {

    ReflectionCodecFactory reflectionCodecFactory = new ReflectionCodecFactory();

    @Test
    public void createJSONCodecWithReflection(){
        Codec testCodec = reflectionCodecFactory.createCodec("json");
        assertTrue(testCodec.getClass().equals(JSONCodec.class));
        assertFalse(testCodec.getClass().equals(XMLCodec.class));
    }

    @Test
    public void createXMLCodecWithReflection(){
        Codec testCodec = reflectionCodecFactory.createCodec("xml");
        assertTrue(testCodec.getClass().equals(XMLCodec.class));
        assertFalse(testCodec.getClass().equals(JSONCodec.class));
    }

}
