package com.skyrexio.junit5.pages;

import static com.codeborne.selenide.Selenide.open;

public class SmartTerminalPage {
    public void openSmartTerminalPage() {
        open("/manual-trading/trading-terminal");
    }
}

