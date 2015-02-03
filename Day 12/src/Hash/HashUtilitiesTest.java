package Hash;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created by Ehshan on 05/01/2015.
 */
public class HashUtilitiesTest {

    @Test
    public void testShortHash() {
        for(int i = 0; i<2000; i++) {
            assertTrue((HashUtilities.shortHash(i) >= 0 && HashUtilities.shortHash(i) <= 1000));
        }
    }
}
