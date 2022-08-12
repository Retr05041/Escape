/*
 * App Test file
 */
package escape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    // Init function testing
    @Test void appInitIsTrue() {
        App classUnderTest = new App();
        assertTrue(classUnderTest.gameInit());
    }
}
