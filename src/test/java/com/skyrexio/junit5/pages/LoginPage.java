package com.skyrexio.junit5.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private static final String TITLE_TEXT = "Войдите в свой аккаунт";
    private static final String LOGIN_ERROR_TOAST_TEXT = "Неверный email или пароль";

    private final SelenideElement titleElement = $(byText(TITLE_TEXT));
    private final SelenideElement emailInput = $("[placeholder=Email]");
    private final SelenideElement passwordInput = $("[type='password']");
    private final SelenideElement loginErrorToast = $("div[data-title]");

    public void openLoginPage() {
        open("/login");
        titleElement.shouldHave(text(TITLE_TEXT));
    }

    public void setEmail(String email) {
        emailInput.setValue(email);
    }

    public void setPassword(String password) {
        passwordInput.setValue(password);
    }

    public void pressEnterOnPassword() {
        passwordInput.pressEnter();
    }

    public void shouldSeeInvalidLoginToast() {
        loginErrorToast.shouldBe(visible)
                .shouldHave(text(LOGIN_ERROR_TOAST_TEXT));
    }
}
