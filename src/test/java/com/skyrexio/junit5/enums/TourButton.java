package com.skyrexio.junit5.enums;

public enum TourButton {
        START("Начать тур"),
        NEXT("Следующий"),
        FINISH("Завершить");

        private final String text;

        TourButton(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
    }
}
