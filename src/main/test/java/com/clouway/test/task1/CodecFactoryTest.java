package com.clouway.test.task1;

import com.clouway.task1.Codec;
import com.clouway.task1.CodecFactory;
import com.clouway.task1.JSONCodec;
import com.clouway.task1.XMLCodec;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class CodecFactoryTest {

    CodecFactory codecFactory = new CodecFactory();


    @Test
    public void createJSONCodec(){
        Codec testCodec = codecFactory.createCodec("json");
        assertTrue(testCodec.getClass().equals(JSONCodec.class));
        assertFalse(testCodec.getClass().equals(XMLCodec.class));
    }

    @Test
    public void createXMLCodec(){
        Codec testCodec = codecFactory.createCodec("xml");
        assertTrue(testCodec.getClass().equals(XMLCodec.class));
        assertFalse(testCodec.getClass().equals(JSONCodec.class));
    }

}
