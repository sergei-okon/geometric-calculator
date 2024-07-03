package com.calculator.service.geometry;

import com.calculator.model.Shape;
import com.calculator.model.shapes.Triangle;
import org.springframework.stereotype.Service;

@Service("triangle")
public class TriangleGeometryService implements GeometryService {

    @Override
    public double calculateArea(Shape shape) {
        Triangle triangle = (Triangle) shape;
        return triangle.calculateArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        Triangle triangle = (Triangle) shape;
        return triangle.calculatePerimeter();
    }
}