package com.skyrexio.junit5.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {
    @Test
    void validLoginTest() {
        open("/login");
        $("[placeholder=Email]").setValue("wheel64959@mriscan.live");
        $("[type='password']").setValue("JR7-iWB-j5q-SnK").pressEnter();
        $x("//*[text()='Статистика']").shouldHave(text("Статистика"));
    }

    @Test
    void invalidEmailLoginTest() {
        open("/login");
        $("[placeholder=Email]").setValue("wheel@mriscan.live");
        $("[type='password']").setValue("JR7-iWB-j5q-SnK").pressEnter();
        $("div[data-title]").shouldHave(text("Неверный email или пароль"));
    }

    @Test
    void invalidPasswordLoginTest() {
        open("/login");
        $("[placeholder=Email]").setValue("wheel64959@mriscan.live");
        $("[type='password']").setValue("JR7-iWB-j5q-S").pressEnter();
        $("div[data-title]").shouldHave(text("Неверный email или пароль"));
    }
}
