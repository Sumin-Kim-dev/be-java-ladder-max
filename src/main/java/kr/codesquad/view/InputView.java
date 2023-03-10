package kr.codesquad.view;

import kr.codesquad.model.Name;
import kr.codesquad.model.Names;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public Names getPeople() {
        OutputView.printInputPeople();
        try {
            return new Names(Arrays.stream(scanner.nextLine().split(","))
                    .map(String::trim)
                    .map(Name::new)
                    .collect(Collectors.toList()));
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e);
            return getPeople();
        }
    }

    public int getMaxHeight() {
        OutputView.printInputMaxHeight();
        return scanner.nextInt();
    }
}
