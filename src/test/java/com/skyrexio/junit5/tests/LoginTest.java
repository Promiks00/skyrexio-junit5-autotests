package com.skyrexio.junit5.tests;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    String validEmail = "wheel64959@mriscan.live";
    String validPassword = "JR7-iWB-j5q-SnK";
    String incorrectEmail = "wheel@mriscan.live";
    String incorrectPassword = "JR7-iWB-j5q-S";

    @Test
    void validLoginTest() {
        loginPage.openLoginPage();
        loginPage.setEmail(validEmail);
        loginPage.setPassword(validPassword);
        loginPage.pressEnterOnPassword();

        mainPage.shouldSeeStatisticsOnMainPage();
    }

    @Test
    void incorrectEmailLoginTest() {
        loginPage.openLoginPage();
        loginPage.setEmail(incorrectEmail);
        loginPage.setPassword(validPassword);
        loginPage.pressEnterOnPassword();
        loginPage.shouldSeeInvalidLoginToast();
    }

    @Test
    void incorrectPasswordLoginTest() {
        loginPage.openLoginPage();
        loginPage.setEmail(validEmail);
        loginPage.setPassword(incorrectPassword);
        loginPage.pressEnterOnPassword();
        loginPage.shouldSeeInvalidLoginToast();
    }
}
