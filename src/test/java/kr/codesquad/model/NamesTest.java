package kr.codesquad.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @Test
    @DisplayName("이름 검증 확인")
    void validateNames() {
        assertDoesNotThrow(() -> new Names(toNameList("pobi", "honux", "crong", "jk")));
        assertThrows(IllegalArgumentException.class,
                () -> new Names(toNameList("pobi", "honux", "crong", "jk", "pobi")),
                "중복된 이름이 있습니다");
        assertThrows(IllegalArgumentException.class,
                () -> new Names(toNameList("pobi", "honux", "crong", "jk", "춘식이")),
                "사용 불가능한 이름이 있습니다");
    }

    private List<Name> toNameList(String... names) {
        return Arrays.stream(names)
                .map(Name::new)
                .collect(Collectors.toList());
    }
}