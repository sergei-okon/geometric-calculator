package com.calculator.model.shapes;

import com.calculator.model.Shape;
import com.calculator.model.enums.ShapeType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
public class Triangle implements Shape {

    private ShapeType shapeType = ShapeType.TRIANGLE;

    @NotNull(message = "SideA must be provided")
    @PositiveOrZero(message = "SideA must be greater than or equal to zero")
    private Double sideA;

    @NotNull(message = "SideB must be provided")
    @PositiveOrZero(message = "SideB must be greater than or equal to zero")
    private Double sideB;

    @NotNull(message = "SideC must be provided")
    @PositiveOrZero(message = "SideC must be greater than or equal to zero")
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
