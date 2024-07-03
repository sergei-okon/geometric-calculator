package com.calculator.model.shapes;

import com.calculator.model.Shape;
import com.calculator.model.enums.ShapeType;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Rectangle implements Shape {

    private ShapeType shapeType = ShapeType.RECTANGLE;

    @NotNull(message = "Length must be provided")
    @Min(value = 0, message = "Length must be greater than or equal to zero")
    private Double length;

    @NotNull(message = "Width must be provided")
    @Min(value = 0, message = "Width must be greater than or equal to zero")
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
