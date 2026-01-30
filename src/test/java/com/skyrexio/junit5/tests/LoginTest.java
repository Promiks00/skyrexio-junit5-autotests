package com.skyrexio.junit5.tests;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    String incorrectEmail = "wheel@mriscan.live";
    String incorrectPassword = "JR7-iWB-j5q-S";

    @Test
    void validLoginTest() {
        loginPage.login(validEmail, validPassword);
        mainPage.shouldSeeStatisticsOnMainPage();
    }

    @Test
    void incorrectEmailLoginTest() {
        loginPage
                .login(incorrectEmail, validPassword)
                .shouldSeeInvalidLoginToast();
    }

    @Test
    void incorrectPasswordLoginTest() {
        loginPage
                .login(validEmail, incorrectPassword)
                .shouldSeeInvalidLoginToast();
    }
}
