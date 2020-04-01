package human;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void addHistory() {
        for(int i = 0; i < 10; i++){
            try {
                person.addHistory("hopefull");
            }catch (Exception e){
                fail();
            }
        }
        Throwable exception = assertThrows(Exception.class,() -> person.addHistory("dreadfull"));
        Assertions.assertEquals("Array full", exception.getMessage());
    }

    @Test
    void subHuman() {
        assertEquals("There are no subhumans, everybody is equal", person.subHuman().greeting());
    }
}