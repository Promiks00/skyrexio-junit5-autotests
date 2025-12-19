package com.skyrexio.junit5.tests;

import com.codeborne.selenide.Configuration;
import com.skyrexio.junit5.pages.LoginPage;
import com.skyrexio.junit5.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected final String validEmail = "wheel64959@mriscan.live";
    protected final String validPassword = "JR7-iWB-j5q-SnK";

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://test.skyrexio.com";
        Configuration.browserSize = "1920x1080";
    }

}
