package kr.codesquad.model;

import java.util.Objects;

public class Name {
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이내여야 합니다");
        }
    }

    public String centerAlignedName() {
        int left = (MAX_NAME_LENGTH - name.length()) / 2;
        int right = MAX_NAME_LENGTH - name.length() - left;
        return " ".repeat(left) + name + " ".repeat(right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
