package com.calculator.service.geometry;

import com.calculator.model.Shape;
import com.calculator.model.shapes.Square;
import org.springframework.stereotype.Service;

@Service("square")
public class SquareGeometryService implements GeometryService {

    @Override
    public double calculateArea(Shape shape) {
        Square square = (Square) shape;
        return square.calculateArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Square square = (Square) shape;
        return square.calculatePerimeter();
    }
}