package com.skyrexio.junit5.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.skyrexio.junit5.enums.TerminalTourStep;
import com.skyrexio.junit5.enums.TourButton;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TerminalTourComponent {
    private static final String MODAL_TITLE = "Добро пожаловать в мульти-ордер терминал";
    private static final String NEXT_BTN_TEXT = "Следующий";

    private final SelenideElement modal = $("div[role='dialog']");
    private final SelenideElement modalStartTourBtn = modal.$("button");
    private final SelenideElement tourOverlay = $("#tour-svg-portal");


    public TerminalTourComponent btnClick(TourButton button) {
        $x(String.format("//button[text()='%s']", button.getText()))
                .shouldBe(visible)
                .shouldHave(text(button.getText()))
                .click();

        return this;
    }

    public TerminalTourComponent checkTerminalTourModalWindow() {
        modal.shouldBe(visible)
                .shouldHave(text(MODAL_TITLE));

        return this;
    }

    public TerminalTourComponent startTourBtnClick(TourButton button) {
        modalStartTourBtn
                .shouldBe(visible)
                .shouldHave(text(button.getText()))
                .click();

        return this;
    }

    public TerminalTourComponent tourOverlayNextClick(TerminalTourStep step) {
        tourOverlay.shouldHave(text(step.getText()));
        btnClick(TourButton.NEXT);

        return this;
    }

    public TerminalTourComponent tourOverlayNextClick(TerminalTourStep step, TourButton button) {
        tourOverlay.shouldHave(text(step.getText()));
        btnClick(button);

        return this;
    }
}
