package human;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoryRecordTest {

    HistoryRecord historyRecord;
    @BeforeEach
    void setUp() {
        historyRecord = new HistoryRecord();

    }

    @Test
    void TestaddDescription() {
        for(int i = 0; i < 10; i++){
            assertTrue(historyRecord.addDescription("hopefull"));
        }
        assertFalse(historyRecord.addDescription("dreadfull"));
    }

    @Test
    void TesttoString() {
    }
}