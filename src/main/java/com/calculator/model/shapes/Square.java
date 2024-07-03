package com.calculator.model.shapes;

import com.calculator.model.Shape;
import com.calculator.model.enums.ShapeType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
public class Square implements Shape {

    private ShapeType shapeType = ShapeType.SQUARE;

    @NotNull(message = "Side must be provided")
    @PositiveOrZero(message = "Side must be greater than or equal to zero")
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
