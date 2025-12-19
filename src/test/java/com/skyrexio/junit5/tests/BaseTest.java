package com.skyrexio.junit5.tests;

import com.codeborne.selenide.Configuration;
import com.skyrexio.junit5.pages.LoginPage;
import com.skyrexio.junit5.pages.MainPage;
import com.skyrexio.junit5.pages.SmartTerminalPage;
import com.skyrexio.junit5.pages.components.TerminalTourComponent;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected final String validEmail = "wheel64959@mriscan.live";
    protected final String validPassword = "JR7-iWB-j5q-SnK";

    protected final String startTourBtnText = "Начать тур";

    protected final String accountAndBalanceStepText = "Аккаунт и баланс";
    protected final String balanceOverviewStepText = "Обзор баланса";
    protected final String tradingViewChartStepText = "График (TradingView)";
    protected final String orderEntryStepText = "Ордер входа";
    protected final String positionSizeSliderStepText = "Слайдер размера позиции";
    protected final String skipEntryStepText = "Пропустить вход (исп. имеющиеся средства)";
    protected final String dcaStepText = "Усреднение (DCA)";
    protected final String takeProfitStepText = "Тейк профит цели";
    protected final String stopLossStepText = "Стоп лосс (защитный)";
    protected final String reviewAndCreateDealStepText = "Проверка и создание сделки";
    protected final String createDealStepText = "Создать сделку";

    protected final String finishTourBtnText = "Завершить";

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    SmartTerminalPage smartTerminalPage = new SmartTerminalPage();
    TerminalTourComponent terminalTourComponent = new TerminalTourComponent();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://test.skyrexio.com";
        Configuration.browserSize = "1920x1080";
    }

}
