package kr.codesquad.model;

import java.util.HashSet;
import java.util.List;

public class Names {
    private static final Name BANNED_NAME = new Name("춘식이");
    private final List<Name> names;

    public Names(List<Name> names) {
        validateNames(names);
        this.names = names;
    }

    private void validateNames(List<Name> names) {
        if (names.contains(BANNED_NAME)) {
            throw new IllegalArgumentException("사용 불가능한 이름이 있습니다");
        }
        if (names.size() != new HashSet<>(names).size()) {
            throw new IllegalArgumentException("중복된 이름이 있습니다");
        }
    }

    public int getSize() {
        return names.size();
    }

    public List<Name> getNames() {
        return names;
    }
}
