package tests;

import org.junit.Test;
import task2.Singleton;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SingletonTest {

    @Test
    public void twoObjectsAreSame() throws Exception {
        Singleton obj1 = Singleton.getObject();
        Singleton obj2 = Singleton.getObject();
        assertThat(obj1, is(obj2));
    }
}