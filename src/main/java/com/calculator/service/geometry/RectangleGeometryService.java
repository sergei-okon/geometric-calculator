package com.calculator.service.geometry;

import com.calculator.model.Shape;
import com.calculator.model.shapes.Rectangle;
import org.springframework.stereotype.Service;

@Service("rectangle")
public class RectangleGeometryService implements GeometryService {

    @Override
    public double calculateArea(Shape shape) {
        Rectangle rectangle = (Rectangle) shape;
        return rectangle.calculateArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Rectangle rectangle = (Rectangle) shape;
        return rectangle.calculatePerimeter();
    }
}