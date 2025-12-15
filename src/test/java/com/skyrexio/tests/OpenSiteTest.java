package com.skyrexio.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenSiteTest {
    @Test
    void shouldOpenSkyrexioTestSite() {
        open("https://test.skyrexio.com");
    }
}
