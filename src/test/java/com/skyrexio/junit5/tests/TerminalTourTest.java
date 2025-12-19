package com.skyrexio.junit5.tests;

import com.skyrexio.junit5.enums.TerminalTourStep;
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
                .tourOverlayNextClick(TerminalTourStep.ACCOUNT_AND_BALANCE)
                .tourOverlayNextClick(TerminalTourStep.BALANCE_OVERVIEW)
                .tourOverlayNextClick(TerminalTourStep.TRADINGVIEW_CHART)
                .tourOverlayNextClick(TerminalTourStep.ORDER_ENTRY)
                .tourOverlayNextClick(TerminalTourStep.POSITION_SIZE_SLIDER)
                .tourOverlayNextClick(TerminalTourStep.SKIP_ENTRY)
                .tourOverlayNextClick(TerminalTourStep.DCA)
                .tourOverlayNextClick(TerminalTourStep.TAKE_PROFIT)
                .tourOverlayNextClick(TerminalTourStep.STOP_LOSS)
                .tourOverlayNextClick(TerminalTourStep.REVIEW_AND_CREATE_DEAL)
                .tourOverlayNextClick(TerminalTourStep.CREATE_DEAL, TourButton.FINISH);

    }
}
