package com.skyrexio.junit5.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TerminalTourTest extends BaseTest {
    @BeforeEach
    void setUp() {
        loginPage.loginAndCheckMainPage(validEmail, validPassword, mainPage);
        smartTerminalPage.openSmartTerminalPage();
    }

    @Test
    public void smartTerminalTourTest() {
        terminalTourComponent.btnClick(startTourText);
        terminalTourComponent.checkTerminalTourModalWindow();
        terminalTourComponent.startTourBtnClick(startTourText);
        //Step 1
        terminalTourComponent.tourOverlayNextClick(stepFirstText);
        //Step2
        terminalTourComponent.tourOverlayNextClick(stepSecondText);
        //Step3
        terminalTourComponent.tourOverlayNextClick(stepThirdText);
        //Step4
        terminalTourComponent.tourOverlayNextClick(stepFourthText);
        //Step5
        terminalTourComponent.tourOverlayNextClick(stepFifthText);
        //Step6
        terminalTourComponent.tourOverlayNextClick(stepSixthText);
        //Step7
        terminalTourComponent.tourOverlayNextClick(stepSeventhText);
        //Step8
        terminalTourComponent.tourOverlayNextClick(stepEighthText);
        //Step9
        terminalTourComponent.tourOverlayNextClick(stepNinthText);
        //Step10
        terminalTourComponent.tourOverlayNextClick(stepTenthText);
        //Step11
        terminalTourComponent.tourOverlayNextClick(stepEleventhText, finishTourText);
    }
}
