package com.skyrexio.junit5.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private static final String
            TITLE_TEXT = "Войдите в свой аккаунт",
            LOGIN_ERROR_TOAST_TEXT = "Неверный email или пароль";

    private final SelenideElement
            titleElement = $(byText(TITLE_TEXT)),
            emailInput = $("[placeholder=Email]"),
            passwordInput = $("[type='password']"),
            loginErrorToast = $("div[data-title]");

    public LoginPage openLoginPage() {
        open("/login");
        titleElement.shouldHave(text(TITLE_TEXT));

        return this;
    }

    public LoginPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public LoginPage pressEnterOnPassword() {
        passwordInput.pressEnter();

        return this;
    }

    public void shouldSeeInvalidLoginToast() {
        loginErrorToast.shouldBe(visible)
                .shouldHave(text(LOGIN_ERROR_TOAST_TEXT));
    }

    public LoginPage login(String email, String password) {
        openLoginPage();
        setEmail(email);
        setPassword(password);
        pressEnterOnPassword();

        return this;
    }

    public void loginAndCheckMainPage(String email, String password, MainPage mainPage) {
        login(email, password);
        mainPage.shouldSeeStatisticsOnMainPage();
    }
}
