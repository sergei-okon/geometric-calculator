package com.calculator.service.geometry;

import com.calculator.model.Shape;

public interface GeometryService {

    double calculateArea(Shape shape);

    double calculatePerimeter(Shape shape);
}
