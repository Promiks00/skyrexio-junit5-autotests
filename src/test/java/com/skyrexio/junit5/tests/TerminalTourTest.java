package com.skyrexio.junit5.tests;

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
                .btnClick(startTourBtnText)
                .checkTerminalTourModalWindow()
                .startTourBtnClick(startTourBtnText)
                .tourOverlayNextClick(accountAndBalanceStepText)
                .tourOverlayNextClick(balanceOverviewStepText)
                .tourOverlayNextClick(tradingViewChartStepText)
                .tourOverlayNextClick(orderEntryStepText)
                .tourOverlayNextClick(positionSizeSliderStepText)
                .tourOverlayNextClick(skipEntryStepText)
                .tourOverlayNextClick(dcaStepText)
                .tourOverlayNextClick(takeProfitStepText)
                .tourOverlayNextClick(stopLossStepText)
                .tourOverlayNextClick(reviewAndCreateDealStepText)
                .tourOverlayNextClick(createDealStepText, finishTourBtnText);
    }
}
