package com.calculator.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ShapeType {

    SQUARE("square"),
    RECTANGLE("rectangle"),
    TRIANGLE("triangle"),
    CIRCLE("circle");

    private final String value;

    ShapeType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ShapeType fromValue(String value) {
        if (value != null) {
            for (ShapeType type : values()) {
                if (type.value.equals(value.trim())) {
                    return type;
                }
            }
        }
        throw new IllegalArgumentException("Unknown ShapeType value: " + value);
    }
}