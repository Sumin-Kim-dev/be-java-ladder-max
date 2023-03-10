package kr.codesquad.controller;

import kr.codesquad.model.Ladder;
import kr.codesquad.model.Names;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class LadderController {
    private final InputView inputView;

    public LadderController() {
        inputView = new InputView();
    }

    public void run() {
        Names people = inputView.getPeople();
        int maxHeight = inputView.getMaxHeight();
        Ladder ladder = new Ladder(people.getSize(), maxHeight);
        ladder.generateLegs();
        OutputView.printPeople(people);
        OutputView.printLadder(ladder);
    }
}
