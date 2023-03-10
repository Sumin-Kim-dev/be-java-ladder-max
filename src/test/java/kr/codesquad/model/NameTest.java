package kr.codesquad.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    @DisplayName("이름 검증 확인")
    void validateName() {
        assertDoesNotThrow(() -> new Name("name"));
        assertThrows(IllegalArgumentException.class, () -> new Name("long-name"), "이름은 5자 이내여야 합니다");
    }

    @Test
    @DisplayName("이름 정렬 확인")
    void centerAlignedName() {
        assertEquals("  g  ", new Name("g").centerAlignedName());
        assertEquals(" gi  ", new Name("gi").centerAlignedName());
        assertEquals(" gil ", new Name("gil").centerAlignedName());
        assertEquals("gils ", new Name("gils").centerAlignedName());
        assertEquals("gilsa", new Name("gilsa").centerAlignedName());
    }
}