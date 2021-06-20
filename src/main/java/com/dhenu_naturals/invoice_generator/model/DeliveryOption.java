package com.dhenu_naturals.invoice_generator.model;

public enum DeliveryOption {
    DOOR("door"), GATE("gate");
    private final String value;

    DeliveryOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
