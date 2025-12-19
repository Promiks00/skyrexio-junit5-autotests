package com.skyrexio.junit5.pages.components;

import com.codeborne.selenide.SelenideElement;

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


    public void btnClick(String btnText) {
        $x(String.format("//button[text()='%s']", btnText)).shouldBe(visible)
                .shouldHave(text(btnText)).click();
    }

    public void checkTerminalTourModalWindow() {
        modal.shouldBe(visible)
                .shouldHave(text(MODAL_TITLE));
    }

    public void startTourBtnClick(String btnText) {
        modalStartTourBtn
                .shouldBe(visible)
                .shouldHave(text(btnText))
                .click();
    }

    public void tourOverlayNextClick(String titleText) {
        tourOverlay.shouldHave(text(titleText));
        btnClick(NEXT_BTN_TEXT);
    }

    public void tourOverlayNextClick(String titleText, String buttonText) {
        tourOverlay.shouldHave(text(titleText));
        btnClick(buttonText);
    }
}
