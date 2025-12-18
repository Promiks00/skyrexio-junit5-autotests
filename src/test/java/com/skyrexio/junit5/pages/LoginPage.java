package com.skyrexio.junit5.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public void openLoginPage(){
        open("/login");
    }

    public void setEmail(String email){
        $("[placeholder=Email]").setValue(email);
    }

    public void setPassword(String password){
        $("[type='password']").setValue(password);
    }

    public void pressEnterOnPassword(){
        $("[type='password']").pressEnter();
    }

    public void shouldSeeInvalidLoginToast() {
        $("div[data-title]").shouldBe(visible)
                .shouldHave(text("Неверный email или пароль"));
    }
}
