package com.skyrexio.junit5.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {
    @Test
    void validLoginTest() {
        open("https://test.skyrexio.com/login");
        $("[placeholder=Email]").setValue("wheel64959@mriscan.live");
        $("[type='password']").setValue("JR7-iWB-j5q-SnK").pressEnter();
        $x("//*[text()='Статистика']").shouldHave(text("Статистика"));
    }
}
