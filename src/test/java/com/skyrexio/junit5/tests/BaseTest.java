package com.skyrexio.junit5.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://test.skyrexio.com";
        Configuration.browserSize = "1920x1080";
    }

}
