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

    protected final String startTourText = "Начать тур";
    protected final String stepFirstText = "Аккаунт и баланс";
    protected final String stepSecondText = "Обзор баланса";
    protected final String stepThirdText = "График (TradingView)";
    protected final String stepFourthText = "Ордер входа";
    protected final String stepFifthText = "Слайдер размера позиции";
    protected final String stepSixthText = "Пропустить вход (исп. имеющиеся средства)";
    protected final String stepSeventhText = "Усреднение (DCA)";
    protected final String stepEighthText = "Тейк профит цели";
    protected final String stepNinthText = "Стоп лосс (защитный)";
    protected final String stepTenthText = "Проверка и создание сделки";
    protected final String stepEleventhText = "Создать сделку";
    protected final String finishTourText = "Завершить";

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
