package kr.codesquad.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    @DisplayName("사다리 크기 체크")
    void generateLegs_size() {
        Ladder ladder = new Ladder(4, 6);
        List<List<Boolean>> legs = ladder.generateLegs();
        assertEquals(6, legs.size());
        assertEquals(4 - 1, legs.get(0).size());
    }

    @RepeatedTest(name = "{displayName} - {currentRepetition} / {totalRepetitions}", value = 10)
    @DisplayName("사다리 발판 체크")
    void generateLegs_valid() {
        Ladder ladder = new Ladder(4, 6);
        List<List<Boolean>> legs = ladder.generateLegs();
        for (List<Boolean> row : legs) {
            for (int i = 1; i < row.size(); i++) {
                if (row.get(i - 1) && row.get(i)) {
                    fail("연속된 발판 존재");
                }
            }
        }
    }
}