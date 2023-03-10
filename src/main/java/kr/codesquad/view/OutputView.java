package kr.codesquad.view;

import kr.codesquad.model.Ladder;
import kr.codesquad.model.Name;
import kr.codesquad.model.Names;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public static void printInputPeople() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public static void printInputMaxHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public static void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void printLadder(Ladder ladder) {
        System.out.println(ladder);
    }

    public static void printPeople(Names names) {
        List<String> centeredName = names.getNames().stream()
                .map(Name::centerAlignedName)
                .collect(Collectors.toList());
        System.out.println(String.join(" ", centeredName));
    }
}
