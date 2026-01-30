package com.skyrexio.junit5.enums;

public enum TerminalTourStep {
    ACCOUNT_AND_BALANCE("Аккаунт и баланс"),
    BALANCE_OVERVIEW("Обзор баланса"),
    TRADINGVIEW_CHART("График (TradingView)"),
    ORDER_ENTRY("Ордер входа"),
    POSITION_SIZE_SLIDER("Слайдер размера позиции"),
    SKIP_ENTRY("Пропустить вход (исп. имеющиеся средства)"),
    DCA("Усреднение (DCA)"),
    TAKE_PROFIT("Тейк профит цели"),
    STOP_LOSS("Стоп лосс (защитный)"),
    REVIEW_AND_CREATE_DEAL("Проверка и создание сделки"),
    CREATE_DEAL("Создать сделку");

    private final String text;

    TerminalTourStep(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
