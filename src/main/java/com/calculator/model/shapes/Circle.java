package com.calculator.model.shapes;

import com.calculator.model.Shape;
import com.calculator.model.enums.ShapeType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
public class Circle implements Shape {

    private ShapeType shapeType = ShapeType.CIRCLE;

    @NotNull(message = "Radius must be provided")
    @PositiveOrZero(message = "Radius must be greater than or equal to zero")
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}