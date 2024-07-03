package com.calculator.service.geometry;

import com.calculator.model.Shape;
import com.calculator.model.shapes.Circle;
import org.springframework.stereotype.Service;

@Service("circle")
public class CircleGeometryService implements GeometryService {

    @Override
    public double calculateArea(Shape shape) {
        Circle circle = (Circle) shape;
        return circle.calculateArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Circle circle = (Circle) shape;
        return circle.calculatePerimeter();
    }
}