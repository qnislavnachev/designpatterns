package com.clouway.test.task2;

import com.clouway.task2.Singleton;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class SingletonTest {

    @Test
    public void happyPath(){
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();
        assertEquals(first.hashCode(), second.hashCode());
    }

}
