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
    }

    @Test
    public void smartTerminalTourTest() {
        open("/manual-trading/trading-terminal");
        $x("//button[text()='Начать тур']").shouldBe(visible)
                .shouldHave(text("Начать тур")).click();
        $("div[role='dialog']").shouldBe(visible)
                .shouldHave(text("Добро пожаловать в мульти-ордер терминал"));
        $("div[role='dialog'] button").shouldHave(text("Начать тур")).click();
        //Step 1
        $(byText("Аккаунт и баланс")).shouldBe(visible)
                .shouldHave(text("Аккаунт и баланс"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
        //Step2
        $(byText("Обзор баланса")).shouldBe(visible)
                .shouldHave(text("Обзор баланса"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
        //Step3
        $x("//div[@id='tour-svg-portal']//*[text()='График (TradingView)']")
                .shouldBe(visible)
                .shouldHave(text("График (TradingView)"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
        //Step4
        $x("//div[@id='tour-svg-portal']//*[text()='Ордер входа']")
                .shouldBe(visible)
                .shouldHave(text("Ордер входа"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
        //Step5
        $x("//div[@id='tour-svg-portal']//*[text()='Слайдер размера позиции']")
                .shouldBe(visible)
                .shouldHave(text("Слайдер размера позиции"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step6
        $x("//div[@id='tour-svg-portal']//*[text()='Пропустить вход (исп. имеющиеся средства)']")
                .shouldBe(visible)
                .shouldHave(text("Пропустить вход (исп. имеющиеся средства)"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step7
        $x("//div[@id='tour-svg-portal']//*[text()='Усреднение (DCA)']")
                .shouldBe(visible)
                .shouldHave(text("Усреднение (DCA)"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step8
        $x("//div[@id='tour-svg-portal']//*[text()='Тейк профит цели']")
                .shouldBe(visible)
                .shouldHave(text("Тейк профит цели"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step9
        $x("//div[@id='tour-svg-portal']//*[text()='Стоп лосс (защитный)']")
                .shouldBe(visible)
                .shouldHave(text("Стоп лосс (защитный)"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step10
        $x("//div[@id='tour-svg-portal']//*[text()='Проверка и создание сделки']")
                .shouldBe(visible)
                .shouldHave(text("Проверка и создание сделки"));
        $x("//button[text()='Следующий']").shouldBe(visible)
                .shouldHave(text("Следующий")).click();
//Step11
        $x("//div[@id='tour-svg-portal']//*[text()='Создать сделку']")
                .shouldBe(visible)
                .shouldHave(text("Создать сделку"));
        $x("//button[text()='Завершить']").shouldBe(visible)
                .shouldHave(text("Завершить")).click();


    }
}
