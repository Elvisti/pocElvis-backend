package com.elvis.pocBackend.domain.model;

public enum AddressType {
    COMMERCIAL("Commercial"),
    CORRESPONDENCE("Correspondence"),
    HOME("Home");

    private final String label;

    AddressType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
