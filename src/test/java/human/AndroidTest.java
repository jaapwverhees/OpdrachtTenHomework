package human;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AndroidTest {

    Android android = new Android(50);

    @BeforeEach
    void setUp() {
        android = new Android(50);
    }

    @Test
    void testIfGreetingifCorrrect() {
        assertEquals("I'm half human, my Energy Level is 50 %", android.greeting());
    }

    @Test
    void charge() {
        assertEquals(50, android.charge(0));
        assertEquals(80, android.charge(30));
        assertEquals(100, android.charge(100));
    }
}