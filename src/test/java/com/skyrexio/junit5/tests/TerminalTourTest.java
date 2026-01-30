package com.skyrexio.junit5.tests;

import com.skyrexio.junit5.enums.TourButton;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerminalTourTest extends BaseTest {
    @BeforeEach
    void setUp() {
        loginPage.loginAndCheckMainPage(validEmail, validPassword, mainPage);
        smartTerminalPage.openSmartTerminalPage();
    }

    @Test
    public void smartTerminalTourTest() {
        terminalTourComponent
                .btnClick(TourButton.START)
                .checkTerminalTourModalWindow()
                .startTourBtnClick(TourButton.START)
                .completeTour();

    }
}
