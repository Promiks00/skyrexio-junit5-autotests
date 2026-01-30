package com.skyrexio.junit5.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public void shouldSeeStatisticsOnMainPage(){
        $x("//*[text()='Статистика']").shouldHave(text("Статистика"));
    }
}
